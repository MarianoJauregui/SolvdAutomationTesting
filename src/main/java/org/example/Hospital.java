package org.example;

import hospital.entities.Doctor;
import hospital.entities.Nurse;
import hospital.enums.AreaOfExpertize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hospital {

    private static final Logger LOGGER = LogManager.getLogger(Hospital.class);


    private String name;
    private String locationCity;
    private String type;

    //Constructors
    public Hospital(String name) {
        this.name = name;
    }

    public Hospital(String name, String locationCity, String type){
        this.name = name;
        this.locationCity = locationCity;
        this.type = type;
    }

    public static void main(String[] args) {

        Hospital hospital1 = new Hospital("Blas Dubarry", "Mercedes", "Private");

        LOGGER.debug(hospital1);
        LOGGER.debug("It is working!");

        //Creating doctors and nurses entities
        Doctor doctor1 = new Doctor("Mariano", 26, 1, AreaOfExpertize.ONC);
        LOGGER.debug(doctor1.printInfo());

        Doctor doctor2 = new Doctor("Andrew", 32, 2, AreaOfExpertize.DER);
        LOGGER.debug(doctor2.printInfo());

        Doctor doctor3 = new Doctor("Jose", 30, 3, AreaOfExpertize.SUR);
        LOGGER.debug(doctor3.printInfo());


        Nurse nurse1 = new Nurse("Sofia", 23, "Vazquez");
        nurse1.setCredential(123456789);
        LOGGER.debug(nurse1.printInfo());




        //REPLACE WITH LOGGER
        //System.out.println(doctor1.equals(nurse1)); //false
        //System.out.println(doctor1.equals(doctor1)); //true, they are the same exact object

    }
}