package com.rdas.redis.db.dao.impl;


import com.rdas.redis.db.dao.EmployeeDao;
import com.rdas.redis.db.model.Employee;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Slf4j
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private final String hashReference= "Employee";

    @Resource(name="redisTemplate")          // 'redisTemplate' is defined as a Bean in AppConfig.java
    private HashOperations<String, Integer, Employee> hashOperations;

    @Override
    public void save(Employee employee) {
        //creates one record in Redis DB if record with that Id is not present
        hashOperations.putIfAbsent(hashReference, employee.getEmployeeId(), employee);
    }

    @Override
    public Employee get(Integer id) {
        log.info("Getting Employee for id {}", id);
        return hashOperations.get(hashReference, id);
    }

    @Override
    public void update(Employee employee) {
        hashOperations.put(hashReference, employee.getEmployeeId(), employee);
    }

    @Override
    public Map<Integer, Employee> getEmployees() {
        log.info("Getting Employees...");
        return hashOperations.entries(hashReference);
    }

    @Override
    public void delete(Integer id) {
        hashOperations.delete(hashReference, id);
    }

    @Override
    public void saveAll(Map<Integer, Employee> map) {
        hashOperations.putAll(hashReference, map);
    }
}
