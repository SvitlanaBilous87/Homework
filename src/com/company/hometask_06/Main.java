package com.company.hometask_06;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7,13);
        System.out.println("Прямокутник_01: довжина = "+ r1.getLength()+" см; ширина = "+ r1.getWidth()+" см.");
        System.out.println("Периметр = "+ r1.perimeter()+" см; площа = "+r1.square()+" см².");
        System.out.println("Прямокутник_02: довжина = "+ r2.getLength()+" см; ширина = "+ r2.getWidth()+" см.");
        System.out.println("Периметр = "+ r2.perimeter()+" см; площа = "+r2.square()+" см².");
        Circle c1 = new Circle (3,6);
        System.out.println("Коло_01: радіус = "+ c1.getR()+" см; діаметр = "+ c1.getD()+" см.");
        System.out.println("Його довжина = "+ c1.length()+" см; площа = "+c1.square()+" см².");
        Circle c2 = new Circle ();
        System.out.println("Коло_02: радіус = "+ c2.getR()+" см; діаметр = "+ c2.getD()+" см.");
        System.out.println("Його довжина = "+ c2.length()+" см; площа = "+c2.square()+" см².");
    }
}
