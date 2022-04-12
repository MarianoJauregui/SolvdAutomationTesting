package hospital.services;

import hospital.areas.Hospital;
import hospital.entities.Doctor;
import hospital.entities.Patient;
import hospital.exceptions.HealthInsuranceNotFound;
import org.example.HospitalMain;

import java.util.Date;

public interface ISaveAppointment {
    Appointment saveAppointment(Hospital hospital, Date date, Doctor doctor, Patient patient, int cost) throws HealthInsuranceNotFound;
}
