
package hospital.entities;

import hospital.enums.AreaOfExpertize;


public class Doctor<S> extends Person {

    private S salary;
    private AreaOfExpertize areaOfExpertize;
    public String test = "Test";

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    private boolean isWorking;

    public S getSalary() {
        return salary;
    }

    public void setSalary(S salary) {
        this.salary = salary;
    }



    public Doctor(String name, int age, int id, AreaOfExpertize areaOfExpertize) {
        super(name, age, id);
        this.areaOfExpertize = areaOfExpertize;
    }

    public AreaOfExpertize getAreaOfExpertize() {
        return areaOfExpertize;
    }

    public void setAreaOfExpertize(AreaOfExpertize areaOfExpertize) {
        this.areaOfExpertize = areaOfExpertize;
    }

    @Override
    public String printInfo(){
        return "\nDoctor info: " +
                super.printInfo() +
                "\nArea of expertize: " + getAreaOfExpertize() + "\n";
    }
}