package com.rdas.redis.db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RedisHash("Employee")
public class Employee implements Serializable {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;
}
