package com.parul.springdatajpa2;

import com.parul.springdatajpa2.entities.Employee;
import com.parul.springdatajpa2.repos.EmployeeRepository;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.Ordered;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashSet;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class SpringDataJpa2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Sql({"/createSchema.sql"})
	void createAllTables(){}

	@Test
	void insertMTMUser(){
		Employee employee = new Employee();
		employee.setFirstName("parul");
		employee.setLastName("sharma");
		employee.setAge(15);
		employee.setSalary(15000);
		employeeRepository.save(employee);

		employee = new Employee();
		employee.setFirstName("shila");
		employee.setLastName("sharma");
		employee.setAge(62);
		employee.setSalary(85000);
		employeeRepository.save(employee);

		employee = new Employee();
		employee.setFirstName("rina");
		employee.setLastName("sharma");
		employee.setAge(45);
		employee.setSalary(75000);
		employeeRepository.save(employee);

		employee = new Employee();
		employee.setFirstName("isha");
		employee.setLastName("singh");
		employee.setAge(33);
		employee.setSalary(55000);
		employeeRepository.save(employee);

		employee = new Employee();
		employee.setFirstName("ila");
		employee.setLastName("sharma");
		employee.setAge(7);
		employee.setSalary(45000);
		employeeRepository.save(employee);
	}

//	@Test
//	public void testFindAboveAvgSalary()
//	{
//		List<Object[]> objects= employeeRepository.findAboveAvgSalary();
//		for (Object[] obj: objects)
//		{
//			System.out.print(obj[0]);
//			System.out.print(" ");
//			System.out.println(obj[1]);
//		}
//	}
//
//	@Test
//	public void testUpdateEmployeeSalary()
//	{
//		employeeRepository.updateSalaryOfEmployee(55555);
//	}



////
//	@Test
//	@Order(Ordered.LOWEST_PRECEDENCE)
//	@Sql({"/dropSchema.sql"})
//	void dropAllTables(){}
}
