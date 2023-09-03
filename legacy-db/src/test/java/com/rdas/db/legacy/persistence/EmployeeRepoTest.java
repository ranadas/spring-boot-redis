package com.rdas.db.legacy.persistence;

import com.rdas.db.legacy.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepoTest {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Test
    public void fetchEmployees() {
        List<Employee> all = employeeRepo.findAll();
        assertNotNull(all);
        assertEquals(all.size(), 0);
    }
}