package Employee.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee.model.Employee;
@Repository
public interface EmployeeDaoInterface extends JpaRepository <Employee,Integer> {

}
