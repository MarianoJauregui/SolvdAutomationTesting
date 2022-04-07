package hospital.exceptions;

public class DiseaseNotFound extends Exception{

    public DiseaseNotFound(String message) {
        super(message);
    }

    public DiseaseNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
