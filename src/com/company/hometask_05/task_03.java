package com.company.hometask_05;

public class task_03 {
    public static void main(String[] args) {
        int ar[][] = new int [5][7];
        System.out.println("Двовимірний масив 5х7, заповнений випадковими числами з проміжку [-2; 75]: ");
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<7; j++){
                ar[i][j] = (int)((Math.random()*78)-2);
                System.out.print(" " + ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
