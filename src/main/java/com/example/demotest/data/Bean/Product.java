package com.example.demotest.data.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long pid;
    protected String pname;
}
