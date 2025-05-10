package com.upiiz.examenii.Models;
import java.util.Date;

public class CustomerModel {
    private int id;
    private String name;
    private Date customerSince;

    public CustomerModel(int id, String name, Date customerSince) {
        this.id = id;
        this.name = name;
        this.customerSince = customerSince;

    }
}
