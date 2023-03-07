package com.liw.controller;

import com.liw.domain.data.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RequestDataController {

    private Map<String,Integer> count;

    @Autowired
    private DataController dataController;

    @Autowired
    private ReadController readController;

    @RequestMapping(value = "/datasource")
    public Map<List<String>,Integer> DealData(@RequestBody RequestData requestData) throws Exception{
        Map<List<String>, Integer> res = new HashMap<>();

        for (String source:
             requestData.getDataSources()) {
            switch (source){
                case "机载雷达":
                    dataController.dealPlane();
                    break;
                case "地面雷达站":
                    dataController.dealGround();
                    break;
                case "电子侦察卫星":
                    dataController.dealElectSate();
                    break;
                case "电磁探测":
                    dataController.dealElectFind();
                    break;
                case "成像卫星":
                    dataController.dealPhotoSate();
                    break;
                case "ADS-B系统":
                    dataController.dealADSBData();
                    break;
                case "AIS系统":
                    dataController.dealAISData();
                    break;
                default:
                    break;
            }
        }

        Thread.sleep(1000);

        for (String source:
                requestData.getDataSources()) {
            switch (source){
                case "机载雷达":
                    List<String> temp1 = readController.toJson("");//源数据
                    List<String> temp2 = readController.toJson("");//处理后数据
                    res.put(temp1,temp1.size()-1);
                    res.put(temp2,temp2.size()-1);
                    break;
                case "地面雷达站":
                    List<String> temp3 = readController.toJson("");//源数据
                    List<String> temp4 = readController.toJson("");//处理后数据
                    res.put(temp3,temp3.size()-1);
                    res.put(temp4,temp4.size()-1);
                    break;
                case "电子侦察卫星":
                    List<String> temp5 = readController.toJson("");//源数据
                    List<String> temp6 = readController.toJson("");//处理后数据
                    res.put(temp5,temp5.size()-1);
                    res.put(temp6,temp6.size()-1);
                    break;
                case "电磁探测":
                    List<String> temp7 = readController.toJson("");//源数据
                    List<String> temp8 = readController.toJson("");//处理后数据
                    res.put(temp7,temp7.size()-1);
                    res.put(temp8,temp8.size()-1);
                    break;
                case "成像卫星":
                    List<String> temp9 = readController.toJson("");//源数据
                    List<String> temp10 = readController.toJson("");//处理后数据
                    res.put(temp9,temp9.size()-1);
                    res.put(temp10,temp10.size()-1);
                    break;
                case "ADS-B系统":
                    List<String> temp11 = readController.toJson("");//源数据
                    List<String> temp12 = readController.toJson("");//处理后数据
                    res.put(temp11,temp11.size()-1);
                    res.put(temp12,temp12.size()-1);
                    break;
                case "AIS系统":
                    List<String> temp13 = readController.toJson("");//源数据
                    List<String> temp14 = readController.toJson("");//处理后数据
                    res.put(temp13,temp13.size()-1);
                    res.put(temp14,temp14.size()-1);
                    break;
                default:
                    break;
            }
        }

        return res;
    }


}
