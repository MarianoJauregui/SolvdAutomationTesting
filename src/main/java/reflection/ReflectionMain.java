package reflection;

import hospital.entities.Doctor;
import hospital.entities.Person;
import hospital.enums.AreaOfExpertize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionMain {
    private static final Logger LOGGER = LogManager.getLogger(ReflectionMain.class);

    public static void main(String[] args) {

       // Class c1 = Doctor.class.getName();
        System.out.println("The super class of the " + Doctor.class.getName() + " class is: " + Doctor.class.getSuperclass());
        //Method[] m = c1.getMethods();

        Class c1 = new Doctor("Mariano", 2, 2, AreaOfExpertize.ONC).getClass();
        Method[] m = c1.getMethods();
        Field[] m2 = c1.getFields();

        System.out.println("There are " + m.length + " methods in this class");
        for(int i=0; i<m.length; i++){
            System.out.println(m[i]);
        }

        System.out.println("There are " + m2.length + " fields in this class");
        for(int i=0; i<m2.length; i++){
            System.out.println(m2[i]);
        }
    }
}
