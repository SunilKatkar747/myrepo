package Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Employee.model.Employee;
import Employee.service.EmployeeServiceInterface;

@RestController
public class Employeecontroller {

	
	@Autowired
	
	private EmployeeServiceInterface employeeserviceinterface;
	
	@GetMapping("/emp/{eid}")
	
	public Employee getEmployeedetails(@PathVariable int eid) {
		return employeeserviceinterface.getEmployeedetails(eid);
		
	
	}
	@GetMapping ("/emp")
	
	public List<Employee> getAllEmployees(){
		return employeeserviceinterface.getAllEmployees();
	}
	
	@PostMapping("emp/add")
	public int addEmployee(@RequestBody Employee e) {
	
		  
		employeeserviceinterface.addEmployee(e);
		return e.getEid();
		
	}
	
	
	@DeleteMapping("/emp/{eid}")
	public void delete(@PathVariable int eid) {
		employeeserviceinterface.delete(eid);
	}
	
	@PutMapping("/emp/{eid}")  
	private void update(@RequestBody Employee e,@PathVariable int eid)   
	{  
		employeeserviceinterface.update(e,eid);
	      
	}  
	
	
	 
	}
  
