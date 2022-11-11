package by.tc.task01.entity;

/**
 * One of the appliance's types
 */
public class Laptop extends Appliance {
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;

    /**
     * creates an instance of laptop
     * @param price
     * @param batteryCapacity
     * @param os
     * @param memoryRom
     * @param systemMemory
     * @param cpu
     * @param displayInches
     */
    public Laptop(int price, double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    /**
     *
     * @return battery capacity
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     *
     * @return OS
     */
    public String getOs() {
        return os;
    }

    /**
     *
     * @return memory ROM
     */
    public int getMemoryRom() {
        return memoryRom;
    }

    /**
     *
     * @return system memory
     */
    public int getSystemMemory() {
        return systemMemory;
    }

    /**
     *
     * @return CPU
     */
    public double getCpu() {
        return cpu;
    }

    /**
     *
     * @return display in inches
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     *
     * @return string representation of Laptop
     */
    @Override
    public String toString() {
        return "Laptop { " +
                "price = " + this.getPrice() +
                ", batteryCapacity = " + this.batteryCapacity +
                ", os = " + this.os +
                ", memoryRom = " + this.memoryRom +
                ", systemMemory = " + this.systemMemory +
                ", cpu = " + this.cpu +
                ", displayInches = " + this.displayInches +
                " }";
    }
}
