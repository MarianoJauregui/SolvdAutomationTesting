package hospital.exceptions;

public class AreaIsFull extends Exception {
    public AreaIsFull(){
    }

    public AreaIsFull(String message){
        super(message);
    }
}