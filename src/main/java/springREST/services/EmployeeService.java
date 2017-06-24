package springREST.services;

import springREST.entity.Employee;

import java.util.List;

/**
 * Created by Rohith on 6/23/2017.
 */
public interface EmployeeService {
    List<Employee> findAll();
    Employee findOne(String id);
    Employee create(Employee emp);
    Employee update(String id, Employee emp);
    void delete(String id);
}
