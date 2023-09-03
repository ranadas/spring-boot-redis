package com.rdas.db.legacy.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DepartmentRepoTest {

    @Autowired
    private DepartmentRepo departmentRepo;
    @Test
    public void fetchDepartments() {
        var edinburgh = departmentRepo.getDepartmentByLocation("EDINBURGH");

        assertNotNull(edinburgh);
        assertEquals(edinburgh.size(), 0);
    }
}