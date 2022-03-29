
package hospital.entities;

import hospital.enums.AreaOfExpertize;
import hospital.treatment.Treatable;

public class Doctor extends Person implements Treatable {
    private AreaOfExpertize areaOfExpertize;

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
                super.toString() +
                "\nArea of expertize: " + getAreaOfExpertize() + "\n";
    }

}