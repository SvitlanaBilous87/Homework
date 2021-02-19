package com.company.hometask_07;

public class Main {
    public static void main(String[] args){
        String name = "Robot";
        robot r1 = new robot(name);
        coffeRobot r2 = new coffeRobot(name);
        robotDancer r3 = new robotDancer(name);
        robotCoocker r4= new robotCoocker(name);
        robot[] R = {r1, r2, r3, r4};
        int k;
        for (k=0; k<R.length; k++){
R[k].work();
        }

    }
}
