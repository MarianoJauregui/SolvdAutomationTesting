package customLinkedList;

import hospital.entities.Doctor;
import hospital.enums.AreaOfExpertize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class ListExample {

    private static final Logger LOGGER = LogManager.getLogger(ListExample.class);

        private static List<Doctor> employeesList = new ArrayList<>();

        public static void add(){
        employeesList.add(new Doctor<>("ListDoctor1", 26, 10, AreaOfExpertize.EMG));
        employeesList.add(new Doctor<>("ListDoctor2", 26, 21, AreaOfExpertize.DER));
        employeesList.add(new Doctor<>("ListDoctor3", 26, 32, AreaOfExpertize.ONC));
        employeesList.add(new Doctor<>("ListDoctor4", 26, 43, AreaOfExpertize.SUR));
        }

    public static void printDoctorCollection(){
        employeesList.forEach(x -> LOGGER.info(x.printInfo()));
    }
}

