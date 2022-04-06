package hospital.exceptions;

public class EmployeeNotFound extends RuntimeException {

    public EmployeeNotFound(){}

    public EmployeeNotFound(String message){
        super(message);
    }

    public EmployeeNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
