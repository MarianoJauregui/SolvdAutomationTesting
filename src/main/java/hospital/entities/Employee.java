package hospital.entities;

import hospital.lambda.Workable;

public abstract class Employee extends Person{

    private double salary;

    public Employee(String name, int age, String lastName) {
        super(name, age, lastName);
    }
    public Employee(String name, int age, String lastName, double salary){
        super(name, age, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(Workable work){
        work.work();
    }

}