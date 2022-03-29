package hospital.entities;

public class Patient extends Person{

    private String insuranceCompany;

    public Patient(String name,
                   int age,
                   String lastName,
                   String insuranceCompany) {
        super(name, age, lastName);
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

}