package hospital.enums;

public enum Disease {
    CANCER("Move to oncology department immediately"),
    ACCIDENT("Car crash, emergency required"),
    RASH("Due to excessive scratching"),
    BROKEN_BONE("Exposed fracture, need surgery");

    private final String disease;

    Disease(String disease) {
        this.disease = disease;
    }

    public String getDisease(){
        return disease;
    }
}
