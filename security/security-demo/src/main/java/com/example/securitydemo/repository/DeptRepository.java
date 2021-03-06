package com.example.securitydemo.repository;

import com.example.securitydemo.domain.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DeptRepository extends JpaRepository<Dept,Long >, JpaSpecificationExecutor {

    List<Dept> findByPid(Long id);
}
