package com.example.demo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class EmployeeService {
    public List<Employee> getEmployees(){
        return List.of(new Employee(12l,
                "bala",
                "male",
                LocalDate.of(2022,8,29),
                "balaon@gmail.com"
        ));
    }


}
