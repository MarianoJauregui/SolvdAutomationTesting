package hospital.lambda;

import hospital.entities.Patient;

import java.util.ArrayList;

public class Database {
    private int num = 0;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Database(){}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient p){
        this.num++;
        patients.add(p);
    }

    public void setPatients(ArrayList<Patient> patients){
        this.patients = patients;
    }

    public Patient lookForPatient(Patient patient){
        return this.patients.stream().filter(patient1 -> patient1.getId() == patient.getId()).findFirst().orElse(null);
    }
}
