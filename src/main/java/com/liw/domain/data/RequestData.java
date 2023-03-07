package com.liw.domain.data;

import lombok.Data;

import java.lang.reflect.Parameter;
import java.util.List;

@Data
public class RequestData {
    private List<String> dataSources;
    private Parameter parameter;
}
