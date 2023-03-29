package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.oracle.nosql.spring.data.repository.NosqlRepository;
import com.oracle.nosql.spring.data.repository.Query;

import java.util.List;

public interface MachineRepo extends NosqlRepository<Machine, MachineId> {

    @Query("declare $p_name String; " +
        "SELECT * FROM Machine as t " +
        "WHERE  regex_like(t.name,  $p_name, 'i') ")
    Iterable<Machine> findByMachineIdNameRegexpIgnoreCase(@Param("$p_name") String name);
    Page<Machine> findAllByMachineIdName(String name, Pageable pageable);
}
