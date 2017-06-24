package springREST.repository;

import org.springframework.stereotype.Repository;
import springREST.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rohith on 6/23/2017.
 */
@Repository
public class EmployeeRespositoryImpl implements EmployeeRespository {
    public List<Employee> findAll() {
        Employee e1 =new Employee();
        e1.setEmail("a@1");
        e1.setFirstName("a");
        e1.setLastName("1");

        return Arrays.asList(e1);
    }

    public Employee findOne(String id) {
        Employee e =new Employee();
        e.setEmail("a@1");
        e.setFirstName("a");
        e.setLastName("1");
        return e;
    }

    public Employee findByEmail(String email) {
        return null;
    }

    public Employee create(Employee emp) {
        return null;
    }

    public Employee update( Employee emp) {
        return null;
    }

    public void delete(Employee emp) {

    }
}
