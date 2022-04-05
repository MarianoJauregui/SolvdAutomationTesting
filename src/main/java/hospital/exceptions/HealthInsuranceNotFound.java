package hospital.exceptions;

public class HealthInsuranceNotFound extends Exception {

    public HealthInsuranceNotFound(){}

    public HealthInsuranceNotFound(String message){
        super(message);
    }

    public HealthInsuranceNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
