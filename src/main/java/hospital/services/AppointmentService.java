package hospital.services;

import hospital.entities.Doctor;
import hospital.entities.Patient;
import hospital.exceptions.HealthInsuranceNotFound;
import org.example.HospitalMain;

import java.util.Date;

public class AppointmentService implements ISaveAppointment{
    @Override
    public Appointment saveAppointment(HospitalMain hospitalMain, Date date, Doctor doctor, Patient patient, int cost) throws HealthInsuranceNotFound {
        if(patient.getInsuranceCompany().isEmpty()){
            throw new HealthInsuranceNotFound("This patient doesn' have an insurance company");
        }
        Appointment appointment = new Appointment(doctor, patient, cost, date);
        return appointment;
    }
}
