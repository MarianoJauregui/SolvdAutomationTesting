package hospital.entities;

import hospital.treatment.Treatable;

public class Nurse<NurseCredential> extends Person implements Treatable {

    private NurseCredential credential;

    public Nurse(String name, int age, String lastName) {
        super(name, age, lastName);
    }

    public NurseCredential getCredential() {
        return credential;
    }

    public void setCredential(NurseCredential credential) {
        this.credential = credential;
    }

    @Override
    public String printInfo(){
        return "\nNurse info: " +
                super.toString() +
                "\nCredential: " + getCredential() + "\n";
    }

}