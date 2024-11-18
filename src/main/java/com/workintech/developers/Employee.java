package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(double salary, String name, long id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}