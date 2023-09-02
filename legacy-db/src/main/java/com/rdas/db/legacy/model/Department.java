package com.rdas.db.legacy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="DEPARTMENT")
public class Department {

    @Column(name = "DEPTCODE")
    @Id
    private Integer deptCode;

    @Column(name = "DeptName")
    private String deptName;

    @Column(name = "LOCATION")
    private String location;
}
