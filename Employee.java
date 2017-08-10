/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.entity;

/**
 *
 * @author hitBrain
 */
public class Employee {
    public int id;
    public String name;
    public int age;
    public String position;
    public int salaryrange;
    public String address;

    public Employee() {
    }

    public Employee(String name, int age, String position, int salaryrange, String address) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salaryrange = salaryrange;
        this.address = address;
    }

    public Employee(int id, String name, int age, String position, int salaryrange, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salaryrange = salaryrange;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalaryrange() {
        return salaryrange;
    }

    public void setSalaryrange(int salaryrange) {
        this.salaryrange = salaryrange;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
