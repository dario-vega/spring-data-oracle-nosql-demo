package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.oracle.nosql.spring.data.repository.NosqlRepository;
import com.oracle.nosql.spring.data.repository.Query;

import java.util.List;

public interface MachineRepo extends NosqlRepository<Machine, MachineId> {

//    Iterable<Machine> findByMachineIdNameRegexpIgnoreCase(String name);
    Page<Machine> findAllByMachineIdName(String name, Pageable pageable);
}
