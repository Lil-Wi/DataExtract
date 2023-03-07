package com.liw.controller;

import com.alibaba.fastjson.JSON;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import java.io.InputStreamReader;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReadController {


    public List<String> toJson(String fileName) throws Exception{
        InputStreamReader reader = new InputStreamReader(Files.newInputStream(Paths.get(fileName)), StandardCharsets.UTF_8);
        CSVReader csvReader = new CSVReaderBuilder(reader).build();
        List<String[]> list = csvReader.readAll();
        List<String> res = new ArrayList<>();
        for (String[] strings : list) {
            String temp = JSON.toJSONString(strings);
            res.add(temp);

        }
        csvReader.close();
        return res;
    }
}
