package com.driver;

public class Boat implements WaterVehicle{

    public int capacity;
    public String name;
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
