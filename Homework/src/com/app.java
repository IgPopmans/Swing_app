package com;

public class app {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[0] = 0;
            array[6] = 1;

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ddd");


        }finally {
            System.out.println("did it");

        }


        Car car = new Car(21234, 234, 23);
        System.out.println(car.canMoveIt(124));
        System.out.println(car.maxPassengers);
        System.out.println(car.getFuelLevel());
    }


}
