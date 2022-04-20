package hospital.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericInfoPrinter <T> {

    private static final Logger LOGGER = LogManager.getLogger(GenericInfoPrinter.class);

    T thingToPrint;

    public GenericInfoPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.toString();
    }

}
