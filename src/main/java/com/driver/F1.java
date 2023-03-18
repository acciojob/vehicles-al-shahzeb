package com.driver;

public class F1 extends Car {

    private int currentGear;

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned

        super(name,4,4,6, isManual, "racing",1);
        this.currentGear=1;
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        newSpeed += rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            currentGear=1;
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0 && newSpeed<=50) {
           currentGear=1;
        }
        else if(newSpeed > 50 && newSpeed<=100) {
            currentGear=2;
        }
        else if(newSpeed > 100 && newSpeed<=150) {
            currentGear=3;
        }
        else if(newSpeed > 150 && newSpeed<=200) {
            currentGear=4;
        }
        else if(newSpeed > 200 && newSpeed<=250) {
            currentGear=5;
        }
        else currentGear=6;
    }

}
