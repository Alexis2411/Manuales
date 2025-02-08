package com.gasme.manualapi.repositories;

import com.gasme.manualapi.entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
