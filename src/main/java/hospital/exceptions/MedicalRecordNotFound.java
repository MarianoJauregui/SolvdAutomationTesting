package hospital.exceptions;

public class MedicalRecordNotFound extends RuntimeException{

    public MedicalRecordNotFound(){}

    public MedicalRecordNotFound(String message){
        super(message);
    }

    public MedicalRecordNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
