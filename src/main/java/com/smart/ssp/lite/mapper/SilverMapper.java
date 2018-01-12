package com.smart.ssp.lite.mapper;


import com.smart.ssp.lite.model.SilverVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SilverMapper {

    void collectSilverInfo(SilverVO silverVO);

    SilverVO getSilverInfo(SilverVO silverVO);

    void updateSilverInfo(SilverVO silverVO);

}
