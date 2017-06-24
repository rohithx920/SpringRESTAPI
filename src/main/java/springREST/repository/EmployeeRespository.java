package springREST.repository;

import springREST.entity.Employee;

import java.util.List;

/**
 * Created by Rohith on 6/23/2017.
 */
public interface EmployeeRespository {
    List<Employee> findAll();
    Employee findOne(String id);
    Employee findByEmail(String email);
    Employee create(Employee emp);
    Employee update( Employee emp);
    void delete(Employee emp);
}
