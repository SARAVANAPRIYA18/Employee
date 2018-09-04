package employee.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import employee.com.bean.*;
import employee.com.business.ConnectToImplement;
import employee.com.dao.imp.EmplyeeDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetails
 */
@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		int age = Integer.parseInt(ageString);
		String date_of_birth = request.getParameter("dob");
		String address = request.getParameter("address");
		String salaryString = request.getParameter("salary");
		float salary = Integer.parseInt(salaryString);
		String description = request.getParameter("description");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		PrintWriter out = response.getWriter();
		
		out.print("Data got from jsp for servlet");
		
		
		out.println("<br>"+"Employee Details :"+"<br>"+name + "<br>" + age + "<br>" + date_of_birth + "<br>" + address + "<br>" + salary + "<br>"
				+ description + "<br>" + email + "<br>" + phone + "<br>");
		
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setAge(age);
		employee.setDob(date_of_birth);
		employee.setAddress(address);
		employee.setSalary(salary);
		employee.setDescription(description);
		employee.setEmail(email);
		employee.setPhone(phone);

		employeeList.add(employee);
		
		
	    
		EmplyeeDaoImp dao = new EmplyeeDaoImp();
		out.print("Data passed to class from servlet");
	dao.getEmployee(employeeList);
		dao.validation(employeeList);
	}

}
