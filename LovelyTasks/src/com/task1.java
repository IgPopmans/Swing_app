package com;
//Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
//
//В этом классе должны быть следующие методы:
//
//addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
//addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
//getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.


public class task1 {

    int r = 0;
    int l = 0;

    public static void main(String[] args) {
        int[] arr1 = new int[]{12, 345, 66, 78, 99, 23};


        System.out.println(getSumArray(arr1));

        System.out.println(getSituation(12, 56));


    }

    public static int getSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        return sum;

    }

    void addRight(int n) {
        r += n;

    }

    void addLeft(int n) {
        l += n;

    }

    public static String getSituation(int r, int l) {
        if (r == l) return "=";
        else if (l > r) return "L";
        else return "R";

    }


}