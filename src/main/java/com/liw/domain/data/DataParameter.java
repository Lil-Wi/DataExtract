package com.liw.domain.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataParameter {
    private String dict;
    private String extract_mode;
    private String cut_mode;
    private String pos_mode;
}
