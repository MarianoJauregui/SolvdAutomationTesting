package hospital.entities;

public class Patient extends Person{

    private String insuranceCompany;
    private boolean medicalRecord;

    public Patient(String name,
                   int age,
                   String lastName,
                   String insuranceCompany, boolean medicalRecord) {
        super(name, age, lastName);
        this.insuranceCompany = insuranceCompany;
        this.medicalRecord = medicalRecord;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public boolean getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(boolean medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}