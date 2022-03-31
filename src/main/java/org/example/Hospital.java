package org.example;

import hospital.areas.GeneralHospital;
import hospital.entities.Doctor;
import hospital.entities.Nurse;
import hospital.entities.Patient;
import hospital.enums.AreaOfExpertize;
import hospital.generics.GenericsExample;
import hospital.services.Appointment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Hospital {

    private static final Logger LOGGER = LogManager.getLogger(Hospital.class);

    public static void main(String[] args) {

        GeneralHospital hospital = new GeneralHospital("Blas Dubarry", "Mercedes", "Private");

        //Creating doctors and nurses entities
        Doctor doctor1 = new Doctor("Mariano", 26, 1, AreaOfExpertize.ONC);
        Doctor doctor2 = new Doctor("Andrew", 32, 2, AreaOfExpertize.DER);

        Nurse nurse1 = new Nurse("Sofia", 23, "Vazquez");
        nurse1.setCredential(123456789);

        //Adding doctors and Nurses
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addNurse(nurse1);

        //Adding patients
        Patient patient1 = new Patient("Martin", 26, "Marinez", "OSDE");

        //Appointments
        Appointment appointmentForPatient1 = new Appointment(hospital ,doctor1, patient1, 25000, new Date());



        //Generics
        GenericsExample<String, Integer> FirstGenericsExample = new GenericsExample<String, Integer>();

        // EmployeesList<Employee> employeesList = new EmployeesList<Employee>();


    }
}