package employee.com.business;

import java.util.List;

import employe.com.dao.EmployeeDao;
import employee.com.bean.Employee;
import employee.com.dao.imp.EmplyeeDaoImp;

public class ConnectToImplement {
  EmployeeDao empImp=null;
  
  public ConnectToImplement() {
     empImp=new EmplyeeDaoImp();
     
}
  public void getEmployee(List<Employee> employeeList) {
	  System.out.println("Entered into business package");
	  empImp.getEmployee( employeeList);
	  
  }
  
}
