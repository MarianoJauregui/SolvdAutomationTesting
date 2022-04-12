package hospital.services;

import hospital.areas.Hospital;
import hospital.entities.Doctor;
import hospital.entities.Patient;
import hospital.exceptions.HealthInsuranceNotFound;
import org.example.HospitalMain;

import java.util.Date;

public class AppointmentService implements ISaveAppointment{
    @Override
    public Appointment saveAppointment(Hospital hospital, Date date, Doctor doctor, Patient patient, int cost) throws HealthInsuranceNotFound {
        if(patient.getInsuranceCompany().isEmpty()){
            throw new HealthInsuranceNotFound("This patient doesn' have an insurance company");
        }
        Appointment appointment = new Appointment(doctor, patient, cost, date);
        return appointment;
    }
}
