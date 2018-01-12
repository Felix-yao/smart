package com.smart.ssp.lite.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class SilverVO implements Serializable {
    private int id;
    private String name;
    private double price;


}
