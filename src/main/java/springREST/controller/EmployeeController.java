package springREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springREST.entity.Employee;
import springREST.services.EmployeeService;
import springREST.services.EmployeeServiceimpl;

import java.util.List;

/**
 * Created by Rohith on 6/23/2017.
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @RequestMapping(method= RequestMethod.GET , value = "/employees", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Employee> findAll(){

        return service.findAll();
    }
    @RequestMapping(method= RequestMethod.GET , value = "/employees/{id}")
    public Employee findOne(@PathVariable("id") String id){

        return service.findOne(id);
    }
    @RequestMapping(method= RequestMethod.POST , value = "/employees/")
    public Employee create(@RequestBody Employee emp){
        return service.create(emp);
    }
    @RequestMapping(method= RequestMethod.PUT , value = "/employees/{id}")
    public Employee update(@PathVariable("id") String empId, @RequestBody Employee emp){
        return service.update(empId, emp);
    }
    @RequestMapping(method= RequestMethod.DELETE , value = "/employees/{id}")
    public void delete(@PathVariable("id") String id){
        service.delete(id);
    }
}
