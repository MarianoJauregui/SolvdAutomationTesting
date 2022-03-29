package hospital.enums;

public enum AreaOfExpertize {
    SUR ("Surgeon"),
    DER("Dermatologist"),
    ONC("Oncologist");

    private final String speciality;

    AreaOfExpertize(String speciality){
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
