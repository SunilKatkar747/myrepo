package Employee.service;

import java.util.List;

import Employee.model.Employee;

public interface EmployeeServiceInterface {

	public Employee getEmployeedetails(int eid);//get employee by id
	public boolean addEmployee(Employee e);// add new employee
	public List<Employee> getAllEmployees();//get all employee list

	public void delete(int eid);	//detele employee by id
	
	 public void update(Employee e,int eid);  //update the existing records
	
}	
