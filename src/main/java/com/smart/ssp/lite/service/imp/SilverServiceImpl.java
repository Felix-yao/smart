package com.smart.ssp.lite.service.imp;

import com.smart.ssp.lite.mapper.SilverMapper;
import com.smart.ssp.lite.model.SilverVO;
import com.smart.ssp.lite.service.SilverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SilverServiceImpl implements SilverService{

    @Autowired
    private SilverMapper silverMapper;

    @Override
    public void collectInfo(SilverVO silverVO) {
        silverMapper.collectSilverInfo(silverVO);
    }

    @Override
    public SilverVO getSilverInfo(SilverVO silverVO) {
        return silverMapper.getSilverInfo(silverVO);
    }

    @Override
    public void updateSilverInfo(SilverVO silverVO) {
        silverMapper.updateSilverInfo(silverVO);
    }


}
