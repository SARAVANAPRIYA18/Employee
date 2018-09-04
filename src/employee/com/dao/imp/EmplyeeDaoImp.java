package employee.com.dao.imp;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.ksr.iet.util.DBUtil;
import employe.com.dao.EmployeeDao;


import employee.com.bean.Employee;

public class EmplyeeDaoImp implements EmployeeDao {
       
	@Override
	public void getEmployee(List<Employee> employeeList) {
		System.out.println("Enter into db entry part");
	  
	   Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
		for (Employee line : employeeList) {
					String sql = "insert into Employee(name,age,dob,address,salary,description,email,phone) values(?,?,?,?,?,?,?,?)";
				connection = DBUtil.getConnection();
				connection.setAutoCommit(false);
				java.util.Date currentDate = new java.util.Date();
				java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
				prepareStatement = connection.prepareStatement(sql);
				System.out.println("checked");
				prepareStatement.setString(1,line.getName());
				prepareStatement.setInt(2, line.getAge());
				prepareStatement.setDate(3,sqlDate);
				prepareStatement.setString(4,line.getAddress());
				prepareStatement.setFloat(5,line.getSalary());
				prepareStatement.setString(6,line.getDescription());
				prepareStatement.setString(7,line.getEmail());
				prepareStatement.setString(8,line.getPhone());
				prepareStatement.executeUpdate();
				connection.commit();
		}
		} catch (Exception e) {
					e.printStackTrace();
			}finally {
				DBUtil.close(connection, prepareStatement,null);
			}
		//return employeeList;
		
		
	}
	

	
public static void main(String[] args) {
	
}



@Override
public void validation(List<Employee> employeeList) {
	System.out.println("Enter into db entry part");
	  
	   Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
		for (Employee line : employeeList) {
					String sql = "insert into Validation(name,email) values(?,?)";
				connection = DBUtil.getConnection();
				connection.setAutoCommit(false);			
				prepareStatement = connection.prepareStatement(sql);
				System.out.println("checked");
				prepareStatement.setString(1,line.getName());
				prepareStatement.setString(2,line.getEmail());
				prepareStatement.executeUpdate();
				connection.commit();
		}
		} catch (Exception e) {
					e.printStackTrace();
			}finally {
				DBUtil.close(connection, prepareStatement,null);
			}
	
}



public boolean isPresent(String name, String password) {
	String sql = "select * from Validation";
	Connection connection = null;
	PreparedStatement prepareStatement = null;
	ResultSet resultSet = null;
	
	System.out.println(" uId and password recieved in implmentation ");
	
	List<String> userIdList    = new ArrayList<>();
	List<String> passwordList  = new ArrayList<>();
	
	try {
		connection = DBUtil.getConnection();
		prepareStatement = connection.prepareStatement(sql);
		resultSet = prepareStatement.executeQuery();
		System.out.println("entered loop");
		while(resultSet.next()){
		
			userIdList.add(resultSet.getString("name"));
			passwordList.add(resultSet.getString("email"));
		
		}
		System.out.println("finished");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil.close(connection, prepareStatement, resultSet);
	}
	
	System.out.println(userIdList.get(0));
	System.out.println(passwordList.get(0));
	
	int count = 0;
	int flag = 0;
	boolean a = false ;
	
	for(int i=0; i<userIdList.size(); i++) {
		
		if(name.equals(userIdList.get(i)) ){
					if(password.equals(passwordList.get(i))) {
						a = true ;
		}
		
	}
	
}
	return a;
}



@Override
public List<Employee> ageDetails(int age) {

	System.out.println("getEmployee called ..");
	String sql = "select * from Employee";
	Connection connection = null;
	PreparedStatement prepareStatement = null;
	ResultSet resultSet = null;
	
	List<String> nameList    = new ArrayList<>();
	List<Integer> ageList  = new ArrayList<>();
	List<String> dobList    = new ArrayList<>();
	List<String> addressList  = new ArrayList<>();
	List<Integer> salaryList    = new ArrayList<>();
	List<String> descriptionList  = new ArrayList<>();
	List<String> emailList  = new ArrayList<>();
	List<String> phoneList    = new ArrayList<>();
	
	try {
		connection = DBUtil.getConnection();
		prepareStatement = connection.prepareStatement(sql);
		resultSet = prepareStatement.executeQuery();
		System.out.println("entered loop");

		while(resultSet.next()){
			nameList.add(resultSet.getString("name"));
			ageList.add(resultSet.getInt("age"));
		    dobList.add(resultSet.getString("dob"));
		    addressList.add(resultSet.getString("address"));
		    salaryList.add(resultSet.getInt("salary"));
		    descriptionList.add(resultSet.getString("description"));
		    emailList.add(resultSet.getString("email"));
		    phoneList.add(resultSet.getString("phone"));
		}
		System.out.println("finished");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil.close(connection, prepareStatement, resultSet);
	}
	List<Employee> employeeList = new ArrayList<Employee>();
	Employee employee = new Employee();

int i=0;
for(i=0;i < ageList.size();i++) {
	System.out.println(nameList.get(i));
	if( ageList.get(i) < age){
		System.out.println(nameList.get(i));
		employee.setName(nameList.get(i));
		employee.setAge(ageList.get(i));
		employee.setDob(dobList.get(i));
		employee.setAddress(addressList.get(i));
		employee.setSalary(salaryList.get(i));
		employee.setDescription(descriptionList.get(i));
		employee.setEmail(emailList.get(i));
		employee.setPhone(phoneList.get(i));
		employeeList.add(employee);
	}
	
}
	return employeeList;
	
}
}
