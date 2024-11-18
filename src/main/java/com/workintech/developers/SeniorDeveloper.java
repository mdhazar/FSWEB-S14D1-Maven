package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(double salary, String name, long id) {
        super(salary, name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " senior developer starts to working...");
    }
}
