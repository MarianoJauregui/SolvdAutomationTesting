package hospital.areas;

public abstract class Area {

    //Create an exception to throw an error when maximum capacity is reached.

    private int personsAllowed;
    private int maxCapacity;


    public int getMaximumCapacity() {
        return maxCapacity;
    }

    public void setMaximumCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getPersonsAllowed() {
        return personsAllowed;
    }

    public void setPersonsAllowed(int personsAllowed){
        this.personsAllowed = personsAllowed;
    }
}