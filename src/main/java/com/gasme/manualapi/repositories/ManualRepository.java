package com.gasme.manualapi.repositories;

import com.gasme.manualapi.entities.Manual;
import org.springframework.data.repository.CrudRepository;

public interface ManualRepository extends CrudRepository<Manual, Long> {
}
