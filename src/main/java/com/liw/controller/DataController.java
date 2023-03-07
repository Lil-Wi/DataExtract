package com.liw.controller;

import com.liw.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataClient dataClient;

    public void dealGround() {
        dataClient.ground();
    }

    public void dealPlane(){
        dataClient.plane();
    }
    public void dealElectSate(){
        dataClient.elect_sate();
    }

    public void dealPhotoSate(){
        dataClient.plane();
    }

    public void dealADSBData(){
        dataClient.AdSB();
    }

    public void dealAISData(){
        dataClient.AIS();
    }

    public void dealElectFind(){
        dataClient.elect_find();
    }
}
