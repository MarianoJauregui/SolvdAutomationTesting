package hospital.services;

import hospital.entities.Doctor;
import hospital.entities.Patient;
import hospital.exceptions.HealthInsuranceNotFound;
import org.example.HospitalMain;

import java.util.Date;

public class Appointment{

    private HospitalMain hospitalMain;
    private Doctor doctor;
    private Patient patient;
    private int cost;
    private Date date;

    public Appointment(){

    }

    public Appointment(Doctor doctor, Patient patient, int cost, Date date){
        this.doctor = doctor;
        this.patient = patient;
        this.cost = cost;
        this.date = date;
    }


    public HospitalMain getHospital() {
        return hospitalMain;
    }

    public void setHospital(HospitalMain hospitalMain) {
        this.hospitalMain = hospitalMain;
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


    public String printAppointmentInfo(){
        return "Hello, " + patient.getName() +". Your appointment is on "
                + date + " with " + doctor.getName() + " and it will cost $" + cost;
    }

}
