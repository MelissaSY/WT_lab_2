package by.tc.task01.entity;
/**
 * Generalized class of all appliances
 */
public class Appliance {
    private int price;

    /**
     *
     * @return price of the appliance
     */
    public int getPrice() {
        return price;
    }

    /**
     * creates an instance of appliance
     * @param price
     */
    public Appliance(int price){
        this.price = price;
    }
}
