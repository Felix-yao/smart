package com.smart.ssp.lite.service;

import com.smart.ssp.lite.model.SilverVO;

public interface SilverService {

    void collectInfo(SilverVO silverVO);

    SilverVO getSilverInfo(SilverVO silverVO);

    void updateSilverInfo(SilverVO silverVO);

}
