package springREST.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springREST.entity.Employee;
import springREST.exception.BadRequestException;
import springREST.exception.ResorceNotFoundException;
import springREST.repository.EmployeeRespository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rohith on 6/23/2017.
 */
@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    EmployeeRespository employeeRespository;
    public List<Employee> findAll() {
        return employeeRespository.findAll();
    }

    public Employee findOne(String id) {
        Employee existing= employeeRespository.findOne(id);
        if(existing == null){
            //exception handling 404 not found
            throw new ResorceNotFoundException("Emp with id"+id+"doesn't exists");
        }
        return existing;
    }

    public Employee create(Employee emp) {

        Employee existing=employeeRespository.findByEmail(emp.getEmail());

        if(existing !=null){
            //exception 400 bad request
            throw new BadRequestException("Employee already exists");
        }
        return employeeRespository.create(emp);
    }

    public Employee update(String id, Employee emp) {
        Employee existing= employeeRespository.findOne(id);
        if(existing == null){
            throw new ResorceNotFoundException("Emp with id"+id+"doesn't exists");
        }
        return employeeRespository.update(emp);
    }

    public void delete(String id)
    {
        Employee existing= employeeRespository.findOne(id);
        if(existing == null){
            throw new ResorceNotFoundException("Emp with id"+id+"doesn't exists");
        }
        employeeRespository.delete(existing);
    }
}
