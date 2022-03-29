package hospital.entities;

public abstract class Employee extends Person{

    private double salary;
    private boolean isWorking;

    public Employee(String name, int age, String lastName) {
        super(name, age, lastName);
    }
    public Employee(String name, int age, String lastName, double salary, boolean isWorking){
        super(name, age, lastName);
        this.salary = salary;
        this.isWorking = isWorking;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }


}