package by.tc.task01.entity;

/**
 * One of the appliance's types
 */
public class Oven extends Appliance {
    private int powerCapacity;
    private int weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    /**
     * creates an instance of oven
     * @param price
     * @param powerCapacity
     * @param weight
     * @param capacity
     * @param depth
     * @param height
     * @param width
     */
    public Oven(int price, int powerCapacity, int weight, int capacity, double depth, double height, double width) {
        super(price);
        this.powerCapacity = powerCapacity;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    /**
     *
     * @return power capacity
     */
    public int getPowerCapacity() {
        return powerCapacity;
    }

    /**
     *
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     *
     * @return string representation of Oven
     */
    public String toString() {
        return "Oven { " +
                "price = " + this.getPrice() +
                ", powerCapacity = " + this.powerCapacity +
                ", weight = " + this.weight +
                ", capacity = " + this.capacity +
                ", depth = " + this.depth +
                ", height = " + this.height +
                ", width = " + this.width +
                " }";
    }
}
