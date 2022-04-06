package hospital.services;

import hospital.entities.Doctor;
import hospital.entities.Patient;
import hospital.exceptions.HealthInsuranceNotFound;
import org.example.HospitalMain;

import java.util.Date;

public interface ISaveAppointment {
    Appointment saveAppointment(HospitalMain hospitalMain, Date date, Doctor doctor, Patient patient, int cost) throws HealthInsuranceNotFound;
}
