package com.gasme.manualapi.repositories;

import com.gasme.manualapi.entities.Manual;
import com.gasme.manualapi.entities.PermissionManual;
import com.gasme.manualapi.entities.Rol;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PermissionRepository extends CrudRepository<PermissionManual, Integer> {
    List<PermissionManual> findByRol(Rol rol);

    List<PermissionManual> findByManual(Manual manual);
}
