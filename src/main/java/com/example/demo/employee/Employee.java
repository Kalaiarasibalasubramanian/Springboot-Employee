package com.example.demo.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DOJ")
    private LocalDate doj;
    @Column(name = "EMAIL")
    private  String email;

    public Employee(){

    }

    public Employee(String name, String gender, LocalDate doj, String email) {
        this.name = name;
        this.gender = gender;
        this.doj = doj;
        this.email = email;
    }

    public Employee(Long id, String name, String gender, LocalDate doj, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.doj = doj;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", doj=" + doj +
                ", email='" + email + '\'' +
                '}';
    }
}
