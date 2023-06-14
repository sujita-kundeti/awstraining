package com.aws.spring.awstraining.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeImpl extends JpaRepository<Employee,Integer> {
}
