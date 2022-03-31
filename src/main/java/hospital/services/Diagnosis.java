package hospital.services;

import hospital.entities.Patient;
import hospital.enums.Disease;

import java.util.Date;

public class Diagnosis {
    private Date date;
    private Patient patient;
    private Disease disease;

    public Diagnosis(Date date, Patient patient, Disease disease){
        this.date = date;
        this.patient = patient;
        this.disease = disease;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String printDiagnosisInfo(){
        return "On " + date + ", " + patient + " has been diagnosed with " + disease;
    }
}
