package by.tc.task01.entity.criteria;

public final class SearchCriteria {

    public static enum Kettle{
        POWER_CONSUMPTION, VOLUME, WEIGHT, HEIGHT, COLOR
    }
    public static enum Oven{
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public static enum Laptop{
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES
    }

    public static enum Refrigerator{
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public static enum TabletPC{
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    public static enum Price{ }
    private SearchCriteria() {}
}
