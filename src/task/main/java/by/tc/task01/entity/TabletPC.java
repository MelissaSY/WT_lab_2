package by.tc.task01.entity;
/**
 * One of the Appliance's types
 */
public class TabletPC extends Appliance {
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    /**
     * Creates an instance of TabletPC
     * @param price
     * @param batteryCapacity
     * @param displayInches
     * @param memoryRom
     * @param flashMemoryCapacity
     * @param color
     */
    public TabletPC(int price, int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    /**
     *
     * @return value of battery capacity
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    /**
     *
     * @return display in inches
     */
    public int getDisplayInches() {
        return displayInches;
    }

    /**
     *
     * @return memory rom
     */
    public int getMemoryRom() {
        return memoryRom;
    }

    /**
     *
     * @return flash memory capacity
     */
    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }
    public String getColor() {
         return color;
    }

    /**
     *
     * @return string representation of tabletPC
     */
    @Override
    public String toString() {
        return "TabletPC { " +
                "price = " + this.getPrice() +
                ", batteryCapacity = " + this.batteryCapacity +
                ", displayInches = " + this.displayInches +
                ", memoryRom = " + this.memoryRom +
                ", flashMemoryCapacity = " + this.flashMemoryCapacity +
                ", color = " + this.color +
                " }";
    }
}
