package hospital.enums;

public enum TypeOfEmployee {
    DIR("Director"),
    MAN("Manager"),
    CLEANSER("Clean Service"),
    SEC("Security");

    private final String job;

    TypeOfEmployee(String job){
        this.job = job;
    }

    public String getJob(){
        return job;
    }
}
