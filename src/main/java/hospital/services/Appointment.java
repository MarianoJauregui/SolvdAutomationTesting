package hospital.services;

import hospital.entities.Doctor;
import hospital.entities.Patient;
import org.example.Hospital;

import java.util.Date;

public class Appointment {

    private Hospital hospital;
    private Doctor doctor;
    private Patient patient;
    private int cost;
    private Date date;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Appointment(Hospital hospital, Doctor doctor, Patient patient, int cost, Date date){
        this.hospital = hospital;
        this.doctor = doctor;
        this.patient = patient;
        this.cost = cost;
        this.date = date;
    }


    public String printAppointmentInfo(){
        return "Hello, " + patient +". Your appointment is on "
                + date + " with " + doctor + " and it will cost $" + cost;
    }
}
