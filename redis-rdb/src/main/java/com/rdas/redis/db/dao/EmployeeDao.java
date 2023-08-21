package com.rdas.redis.db.dao;


import com.rdas.redis.db.model.Employee;

import java.util.Map;

public interface EmployeeDao {
    void save(Employee employee);
    Employee get(Integer id);
    void update(Employee employee);
    Map<Integer, Employee> getEmployees();
    void delete(Integer id);
    void saveAll(Map<Integer, Employee> map);
}
