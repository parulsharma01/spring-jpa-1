package com.spring.springjpa1.repos;

import com.spring.springjpa1.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
     List<Employee> findByName(String name);
     List<Employee> findByNameLike(String str);
     List<Employee> findByAgeBetween(int age1, int age2);


}
