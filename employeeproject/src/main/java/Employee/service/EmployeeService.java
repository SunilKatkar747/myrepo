package Employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.dao.EmployeeDaoInterface;
import Employee.model.Employee;
@Service
public class EmployeeService implements EmployeeServiceInterface {

	
	@Autowired
	
	private EmployeeDaoInterface employeedaointerface;
	
	@Override
	public Employee getEmployeedetails(int eid) {
		Employee emp=new Employee();
		Optional<Employee>x=employeedaointerface.findById(eid);
		if(x.isPresent()) {
			emp=x.get();
		}
		return emp;
	}

	@Override
	public boolean addEmployee(Employee em) {
		// TODO Auto-generated method stub
		
		
		boolean added = false;
		
		try {
			
			employeedaointerface.save(em);
			added=true;
		} catch (Exception e) {
			

		}
		return added;
	}	
	

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=new ArrayList<Employee>();  
		list= employeedaointerface.findAll();  
		
		return list;
	}

	public void delete(int id) {
		employeedaointerface.deleteById(id);
		
	}

	@Override
	public void update(Employee e, int eid) {
	
		 employeedaointerface.save(e);
	}

	

}
