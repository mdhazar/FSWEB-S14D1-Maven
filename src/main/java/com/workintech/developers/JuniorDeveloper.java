package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(double salary, String name, long id) {
        super(salary, name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " junior developer starts to working...");
    }
}
