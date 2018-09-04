package employe.com.dao;

import java.util.List;

import employee.com.bean.Employee;

public interface EmployeeDao {
 public void getEmployee(List<Employee> employeeList);
 public void validation(List<Employee> employeeList);
 public List<Employee> ageDetails(int age);
}
