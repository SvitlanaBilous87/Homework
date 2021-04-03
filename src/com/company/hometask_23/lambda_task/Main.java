package com.company.hometask_23.lambda_task;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter 3 integer numbers: ");
        try {
            int num1 = checkedNumber();
            int num2 = checkedNumber();
            int num3 = checkedNumber();

        Operationable maxValue = (a,b,c) -> {
            List<Integer> numbers = new ArrayList<>(Arrays.asList(a, b, c));
            Collections.sort(numbers);
            return numbers.get(numbers.size()-1);
        };

        Operationable arithmeticMean = (a, b, c) -> (a+b+c)/3;

        Operationable sum = (a, b, c) -> a+b+c;

        System.out.println("Maximum value : "+maxValue.result(num1, num2, num3));
        System.out.println("Arithmetic mean : "+arithmeticMean.result(num1, num2, num3));
        System.out.println("Sum : "+sum.result(num1, num2, num3));

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static Integer checkedNumber() throws IllegalArgumentException{
        Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            else {
                throw new IllegalArgumentException("Incorrect input.");
            }
    }
}
