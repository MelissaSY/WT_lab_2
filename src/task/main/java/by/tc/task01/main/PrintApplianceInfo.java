package by.tc.task01.main;
import java.util.List;

import by.tc.task01.entity.Appliance;

/**
 * Helps visualise found appliances
 */
public class PrintApplianceInfo {
    /**
     * prints appliances to console
     * @param appliances
     */
    public static void print(List<Appliance> appliances) {
        if(appliances!=null){
            for (Appliance appliance:
                    appliances) {
                System.out.println(appliance);
            }
        }
    }
}