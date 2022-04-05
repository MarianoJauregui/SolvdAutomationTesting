package hospital.areas;

import hospital.entities.Doctor;
import hospital.entities.Nurse;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String locationCity;
    private String type;
    private List<Doctor> doctorList = new ArrayList<>();
    private List<Nurse> nurseList = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public Hospital(String name, String locationCity, String type){
        this.name = name;
        this.locationCity = locationCity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(List<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    public void addDoctor(Doctor doctor){
        this.getDoctorList().add(doctor);
    }
    public void removeDoctor(Doctor doctor){
        this.getDoctorList().remove(doctor);
    }

    public void addNurse(Nurse nurse){
        this.getNurseList().add(nurse);
    }
    public void removeNurse(Nurse nurse){
        this.getNurseList().remove(nurse);
    }


}
