package com.liw.domain.data;

import lombok.Data;

import java.util.List;

@Data
public class DataStatistic {
    private int datasource_num;
    private int file_num;
    private int data_num;
    private List<Integer> entity_data_distribute;
    private List<Integer> event_data_distribute;
    private List<Integer> state_data_distribute;
}
