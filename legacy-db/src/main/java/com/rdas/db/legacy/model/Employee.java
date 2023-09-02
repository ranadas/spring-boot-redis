package com.rdas.db.legacy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Column(name = "EmpCode")
    @Id
    private Integer empCode;

    @Column(name = "EmpFName")
    private String empFName;

    @Column(name = "EmpLName")
    private String empLName;

    @Column(name = "Job")
    private String job;

    @Column(name = "Manager")
    private String manager;

    @Column(name = "HireDate")
    private LocalDate hireDate;

    @Column(name = "Salary")
    private BigDecimal salary;

    @Column(name = "Commission")
    private Integer Commission;

    @Column(name = "DEPTCODE")
    private Integer deptCode;
}
