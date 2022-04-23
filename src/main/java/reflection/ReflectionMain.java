package reflection;

import hospital.entities.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class ReflectionMain {
    private static final Logger LOGGER = LogManager.getLogger(ReflectionMain.class);

    public static void getConstructors(){
        try{
            Class person = Person.class;
            Constructor[] constructors = Person.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Parameters:" + constructor.getParameterCount());
            }
        } catch (Throwable e) {
            LOGGER.error(e);
        }
    }

    public static void getFields(){
        try{
            Class person = Person.class;
            Field[] fields = Person.class.getDeclaredFields();
            for(Field field : fields){
                System.out.println("Fields: " + Modifier.toString(field.getModifiers()) + " - " + field.getType().getName() + " - " + field.getName());
            }
        } catch (Throwable e) {
            LOGGER.error(e);
        }
    }

    public static void getMethods(){
        try{
            Class person = Person.class;
            Method[] methods = Person.class.getDeclaredMethods();
            for(Method method : methods){
                System.out.println("The method's name is: " + method.getName() + " and the method return type is " + method.getReturnType());
            }
        } catch (Throwable e){
            LOGGER.error(e);
        }
    }

    public static void main(String[] args) {

        getConstructors();
        getFields();
        getMethods();
        }
}
