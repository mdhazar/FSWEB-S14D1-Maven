package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(double salary, String name, long id) {
        super(salary, name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " mid developer starts to working...");
    }
}
