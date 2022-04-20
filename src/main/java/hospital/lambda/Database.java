package hospital.lambda;

import hospital.entities.Patient;

import java.util.ArrayList;

public class Database {
    private ArrayList<Patient> patients = new ArrayList<>();

    public Database(){}

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient p){
        patients.add(p);
    }

    public void setPatients(ArrayList<Patient> patients){
        this.patients = patients;
    }

    public Patient lookForPatient(Patient patient){
        return this.patients.stream().filter(patient1 -> patient1.getId() == patient.getId()).findFirst().orElse(null);
    }
}
