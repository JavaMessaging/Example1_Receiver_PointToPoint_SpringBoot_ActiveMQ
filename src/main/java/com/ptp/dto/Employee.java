package com.ptp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Employee implements Serializable {
    long id;
    String name;
}
