package by.tc.task01.entity;

/**
 * One of the Appliance's types
 */
public class Kettle extends Appliance {
    private double volume;
    private int weight;
    private int height;
    private String color;

    /**
     * Creates a kettle
     * @param price
     * @param volume
     * @param weight
     * @param height
     * @param color
     */
    public Kettle(int price, double volume, int weight, int height, String color) {
        super(price);
        this.volume = volume;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    /**
     *
     * @return weight of the kettle
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return height of the kettle
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return color of the kettle
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return volume of the kettle
     */
    public double getVolume() {
        return volume;
    }

    /**
     *
     * @return string representation of the kettle
     */
    @Override
    public String toString() {
        return "Kettle { " +
                "price = " + this.getPrice() +
                ", weight = " + this.weight +
                ", height = " + this.height +
                ", color = " + this.color +
                ", volume = " + this.volume +
                " }";
    }
}
