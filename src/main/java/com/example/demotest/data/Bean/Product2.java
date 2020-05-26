package com.example.demotest.data.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product2 {
    private String pname;
    private String pdiscription;
    private Long pcategoryid;
    private Long pprice;
    private String ppicture;
}
