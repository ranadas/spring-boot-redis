package com.rdas.redis.db.service;

import com.rdas.redis.db.dao.EmployeeDao;
import com.rdas.redis.db.model.Employee;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {
    private final RedisTemplate<String, Employee> redisTemplate;

    private final EmployeeDao employeeDao;
    @PostConstruct
    public void init() {
        log.info(redisTemplate.toString());
        List<RedisClientInfo> clientList = redisTemplate.getClientList();
        clientList.forEach(it-> log.info(it.toString()));
    }

    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public Map<Integer, Employee> getPublishedEmployees() {
        return employeeDao.getEmployees();
    }

    public Employee getEmployee(int employeeId) {
        return employeeDao.get(employeeId);
    }
}
