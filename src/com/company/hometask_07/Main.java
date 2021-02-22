package com.company.hometask_07;

public class Main {
    public static void main(String[] args){
        System.out.println("TASK_01:");
        String name = "Robot";
        Robot r1 = new Robot(name);
        CoffeRobot r2 = new CoffeRobot(name);
        RobotDancer r3 = new RobotDancer(name);
        RobotCoocker r4= new RobotCoocker(name);
        Robot[] R = {r1, r2, r3, r4};
        int k;
        for (k=0; k<R.length; k++){
R[k].work();
        }
        System.out.println("TASK_02:");
        SteeringWheel sw = new SteeringWheel(20, "plastic", "black");
        Wheels w = new Wheels(50, 20, "GoodYear");
        Body b = new Body("white", "sedan");
        Car c = new Car("Toyota", 2006, "petrol", 0, sw, w, b);
        System.out.println("Basic configuration:");
        System.out.println(c);
        c.longRide();
        sw.tuningSteeringWheel(2, "red");
        w.tuningWheels(3, 3, "Michelin");
        b.tuningBody("black", "sport");
        System.out.println("Tuning configuration:");
        System.out.println(c);
        c.longRide();
        System.out.println("TASK_03:");
        Animal a = new Animal("Лев", 60, 10);
        System.out.println("Назва тварини: "+a.getName()+", швидкість тварини: "+a.getSpeed()+" км/год, вік тварини: "+a.getAge()+" років.");
        System.out.println("_______________________________________________________________________");
        a.setName("Тушканчик");
        a.setSpeed(20);
        a.setAge(3);
        System.out.println("Назва тварини: "+a.getName()+", швидкість тварини: "+a.getSpeed()+" км/год, вік тварини: "+a.getAge()+" роки.");
    }

}
