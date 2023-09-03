package com.rdas.db.legacy.resource;

import com.rdas.db.legacy.model.Employee;
import com.rdas.db.legacy.persistence.EmployeeRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class OrganisationalController {
    private final EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> all = employeeRepo.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@Valid @RequestBody Employee employee) {
        employeeRepo.save(employee);
        return ResponseEntity.ok().build();
    }
}
