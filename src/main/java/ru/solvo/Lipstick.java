package ru.solvo;

public class Lipstick {
    String brand;
    int price;
    boolean overdue;
    int weight;
    String []colors = {"red", "pink", "colorless"};
    int[] amountOfLayers = {0, 1, 2, 3};

    public Lipstick(String brand, int price, boolean overdue, int weight){
        this.brand = brand;
        this.price = price;
        this.overdue = overdue;
        this.weight = weight;
    }

    String setBrand(String brand){
        this.brand = brand;
        return brand;
    }

    void whatWeight(int weight) {
        if (weight > 0) {
            System.out.println("You can still use it.");
        } else {
            System.out.println("It is finished");
        }
    }

    boolean isThisLipstickOverdue(){
        return overdue;
    }

    void printLayers(){
        for (int i = 0; i < amountOfLayers.length; i++){
            System.out.println("The required number of layers - " + amountOfLayers[i]);
        }

    }
    void printColor(){
        int i = 0;
        while (i< colors.length){
            System.out.println("The lipstick color is " + colors[i]);
            i++;
        }
    }

    }


