package com.kalmounabderrahmane.orderservice.models;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
}