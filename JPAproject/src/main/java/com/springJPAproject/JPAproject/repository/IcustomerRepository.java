package com.springJPAproject.JPAproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springJPAproject.JPAproject.customer.customerClass;

@Repository
public interface IcustomerRepository extends JpaRepository<customerClass, Integer>{

}
