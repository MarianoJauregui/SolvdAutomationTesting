package hospital.exceptions;

public class AppointmentNotFound extends Exception {

    public AppointmentNotFound(String message) {
        super(message);
    }

    public AppointmentNotFound(String message, Throwable cause) {
        super(message, cause);
    }


}