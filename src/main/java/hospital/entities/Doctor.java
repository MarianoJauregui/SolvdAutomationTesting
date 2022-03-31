
package hospital.entities;

import hospital.enums.AreaOfExpertize;
import hospital.treatment.Treatable;

public class Doctor<S> extends Person implements Treatable {

    private S salary;
    private AreaOfExpertize areaOfExpertize;

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