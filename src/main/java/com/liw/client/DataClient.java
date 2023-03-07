package com.liw.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "data-client", url = "http://127.0.0.1:5000")
public interface DataClient {

    @RequestMapping(value = "/ground_rad")//地面雷达站数据
    void ground();

    @RequestMapping(value = "/plane_rad")//机载雷达数据
    void plane();

    @RequestMapping(value = "/elect_sate")//电子侦察卫星数据
    void elect_sate();

    @RequestMapping(value = "/photo_sate")//成像卫星数据
    void photo_sate();

    @RequestMapping(value = "/ADSB_data")//ADS-B系统数据
    void AdSB();

    @RequestMapping(value = "/AIS_data")//AIS系统数据
    void AIS();

    @RequestMapping(value = "/elect_find")//电磁探测数据
    void elect_find();

}
