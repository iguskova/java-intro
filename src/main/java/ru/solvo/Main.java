package ru.solvo;

public class Main {

    public static void main(String[] args) {
        Lipstick newLipstick = new Lipstick("Dior", 3000, false, 1);
        Lipstick newLipstick2 = new Lipstick("Mac", 1700, true, 2);


        newLipstick.printColor();
        newLipstick2.printLayers();

        boolean overdue = newLipstick.isThisLipstickOverdue();

        System.out.println(overdue);
        System.out.println(newLipstick2.setBrand("Chanel"));
        System.out.println(newLipstick.setBrand("Noname"));


    }
}
