package com.example.textquest2;

public class Specifications {
    private static Specifications instance;

    private int happiness;
    private int satiety;
    private int energy;

    private Specifications(int happiness, int satiety, int energy){
        this.happiness=happiness;
        this.satiety=satiety;
        this.energy=energy;
    }

    public static Specifications getInstance(){
        if (instance==null) {
            instance = new Specifications(50, 50, 50);
        }
        return instance;
    }

    public int getHappiness() {
        return happiness;
    }
    public int getSatiety() {
        return satiety;
    }
    public int getEnergy() {
        return energy;
    }

    public void changeValues(int[] changed){
        happiness+=changed[0];
        satiety+=changed[1];
        energy+=changed[2];
    }

    public void resetSpecifications(){
        happiness=50;
        satiety=50;
        energy=50;
    }
}
