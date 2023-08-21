package com.rdas.redis.db.resource;

import com.rdas.redis.db.model.Employee;
import com.rdas.redis.db.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeRedisController {
    private final EmployeeService employeeService;

    @PostMapping("/publish")
    public ResponseEntity<String> publishEmployee (@RequestBody Employee employee) {
        log.info("Request received {}", employee.toString());
        employeeService.addEmployee(employee);
        return ResponseEntity.ok("Employee Published");
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getEmployees() {
        return ResponseEntity.ok(employeeService.getPublishedEmployees());
    }

    @GetMapping("/get")
    public ResponseEntity<?> getEmployeeFor(@RequestParam int employeeId) {
        return ResponseEntity.ok(employeeService.getEmployee(employeeId));
    }
}
