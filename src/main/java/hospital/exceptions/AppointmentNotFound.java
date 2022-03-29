package hospital.exceptions;

public class AppointmentNotFound extends RuntimeException {

    public AppointmentNotFound(String message) {
        super(message);
    }

    public AppointmentNotFound(String message, Throwable cause) {
        super(message, cause);
    }


}