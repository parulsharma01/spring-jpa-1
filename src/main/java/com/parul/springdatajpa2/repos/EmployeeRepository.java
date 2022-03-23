package com.parul.springdatajpa2.repos;

import com.parul.springdatajpa2.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
        @Query("from Employee")
        List<Employee> findALlEmployees();

//    @Query("SELECT fname,lname,age, salary FROM Employee WHERE \n" +
//            "(SELECT AVG(salary) FROM Employee)<salary \n" +
//            "ORDER BY  Employee.age desc, Employee.salary ASC")
//    List<Object[]> findAboveAvgSalary();

//    @Modifying
//    @Query("UPDATE Employee e " +
//            "SET e.salary= :salary " +
//            "WHERE e.salary<(SELECT AVG(salary) FROM e)")
//    void updateSalaryOfEmployee(@Param("salary") int salary);
}
