package com.example.demotest.data.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OderForm {
    private Long oid;
    private Long buyerid;
    private Long oproductid;
    private Long ototalprice;
    private String ostarttime;
    private String oaddressee;
    private String oaddress;

}
