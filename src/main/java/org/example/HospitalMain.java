package org.example;

import customLinkedList.LinkedList;
import hospital.areas.Hospital;
import hospital.entities.Doctor;
import hospital.entities.Nurse;
import hospital.entities.Patient;
import hospital.enums.AreaOfExpertize;
import hospital.exceptions.EmployeeNotFound;
import hospital.services.Appointment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

import static customLinkedList.LinkedList.add;
import static customLinkedList.LinkedList.printLinkedList;

public class HospitalMain {

    private static final Logger LOGGER = LogManager.getLogger(HospitalMain.class);

    public static void main(String[] args) {

        //final AppointmentService appointment = new AppointmentService();

        Hospital hospital1 = new Hospital("Blas Dubarry", "Mercedes", "Private");

        //Creating doctors and nurses entities
        Doctor doctor1 = new Doctor("Mariano", 26, 1, AreaOfExpertize.ONC);
        Doctor doctor2 = new Doctor("Andrew", 32, 2, AreaOfExpertize.DER);
        Nurse nurse1 = new Nurse("Sofia", 23, "Vazquez");
        nurse1.setCredential(123456789);

        //Adding doctors and Nurses
        hospital1.addDoctor(doctor1);
        hospital1.addDoctor(doctor2);
        hospital1.addNurse(nurse1);

        //Adding patients
        Patient patient1 = new Patient("Martin", 26, "Martinez", "OSDE");


        //Appointments
        Appointment appointmentForPatient1 = new Appointment(doctor1, patient1, 25000, new Date());
        LOGGER.info(appointmentForPatient1.printAppointmentInfo());

        //Appointment not found
        try{
            hospital1.removeDoctor(doctor2);
        } catch (EmployeeNotFound e){
            LOGGER.error(e.getMessage());
        }

        //Custom LinkedList
        LinkedList list = new LinkedList();

        //Insertion of data
        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 5);
        //Quiero imprimirlo por Logger, preguntar a José después
        printLinkedList(list);

    }
}