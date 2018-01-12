package com.smart.ssp.lite.controller;


import com.smart.ssp.lite.model.SilverVO;
import com.smart.ssp.lite.service.SilverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SilverController {

    @Autowired
    private SilverService silverService;

    //查找
    @RequestMapping("/getSilverInfo")
    @ResponseBody
    public SilverVO getSilverInfo(){
        SilverVO silverVO = new SilverVO();
        silverVO.setId(1);
        silverVO = silverService.getSilverInfo(silverVO);
        System.out.println(silverVO);
        return silverVO;
    }

    //插入数据
    @RequestMapping("/collectSilverInfo")
    public SilverVO collectSilverInfo(){
        SilverVO silverVO = new SilverVO();
        silverVO.setName("test2");
        silverVO.setPrice(55);
        silverService.collectInfo(silverVO);
        return silverVO;
    }

    //更新数据
    @RequestMapping("/updateSilverInfo")
    public SilverVO updateSilverInfo(){
        SilverVO silverVO = new SilverVO();
        silverVO.setName("test2");
        silverVO.setPrice(44);
        silverVO.setId(2);
        silverService.updateSilverInfo(silverVO);
        return silverVO;
    }

    @RequestMapping("testJson")
    public String testJson(){
        return "test Json";
    }


}
