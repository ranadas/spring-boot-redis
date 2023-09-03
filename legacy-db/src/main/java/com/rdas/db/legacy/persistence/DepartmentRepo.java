package com.rdas.db.legacy.persistence;

import com.rdas.db.legacy.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    @Query("SELECT f FROM Department f WHERE LOWER(f.location) = LOWER(:location)")
    List<Department> getDepartmentByLocation(@Param("location") String location);
}
