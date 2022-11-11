package by.tc.task01.entity;

/**
 * One of the appliance's types
 */
public class Refrigerator extends Appliance {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    /**
     * Creates an instance of refrigerator
     * @param price
     * @param powerConsumption
     * @param weight
     * @param freezerCapacity
     * @param overallCapacity
     * @param height
     * @param width
     */
    public Refrigerator(int price, int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    /**
     *
     * @return power consumption
     */
    public int getPowerConsumption() {
        return powerConsumption;
    }

    /**
     *
     * @return weight of the refrigerator
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return freezer capacity
     */
    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     *
     * @return overall capacity
     */
    public double getOverallCapacity() {
        return overallCapacity;
    }

    /**
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @return string representation of Refrigerator
     */
    public String toString() {
        return "Refrigerator { " +
                "price = " + this.getPrice() +
                ", powerConsumption = " + this.powerConsumption +
                ", weight = " + this.weight +
                ", freezerCapacity = " + this.freezerCapacity +
                ", overallCapacity = " + this.overallCapacity +
                ", height = " + this.height +
                ", width = " + this.width +
                " }";
    }
}
