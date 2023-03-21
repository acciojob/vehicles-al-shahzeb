package com.driver;

public class Boat implements WaterVehicle{

    private int capacity;
    private String name;



    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVehicleName() {
        return name;
    }


    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
