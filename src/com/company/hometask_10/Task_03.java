package com.company.hometask_10;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Third task: checking numbers. Their addition, subtraction, multiplication and division.
         */
        System.out.println("Enter two numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        try {
            if (a < 0 && b < 0) {
                throw new IllegalArgumentException("Incorrect input. Both numbers can not be <0.");
            }
            if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
                throw new ArithmeticException("Incorrect input. One of numbers can not be equal 0.");
            }
            if (a == 0 && b == 0) {
                throw new IllegalAccessException("Incorrect input. Both numbers can not be equal 0.");
            }
            if (a > 0 && b > 0) {
                throw new MyException("Incorrect input. Both numbers can not be >0.");
            }

            System.out.println(a+"+"+b+"="+(a+b)+";"+"\n"
                    +a+"-"+b+"="+(a-b)+";"+"\n"
                    +a+"*"+b+"="+(a*b)+";"+"\n"
                    +a+"/"+b+"="+(a/b)+".");
        }

        catch (IllegalArgumentException | ArithmeticException | IllegalAccessException |
                MyException e) {
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Numbers are checked.");
        }
    }
}


