package collections;

import hospital.entities.Nurse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private static final Logger LOGGER = LogManager.getLogger(MapExample.class);

    static Map<Nurse, Integer> nurseMap = new HashMap();

    public static void addNurses(){
        nurseMap.put(new Nurse<>("MapNurse1", 26, "MapNurse1"), 1);
        nurseMap.put(new Nurse<>("MapNurse2", 26, "MapNurse2"), 2);
        nurseMap.put(new Nurse<>("MapNurse3", 26, "MapNurse3"), 3);
        nurseMap.put(new Nurse<>("MapNurse4", 26, "MapNurse4"), 4);
    }

    public static void printNurseMapCollection() {
        nurseMap.forEach((k,v) -> LOGGER.info("Nurse info: " + k + " \n" + "Id:" + v));
    }



}
