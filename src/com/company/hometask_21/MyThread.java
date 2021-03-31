package com.company.hometask_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread{

    private List<Integer> numbers;
    private long timeout;

    public MyThread(long timeout) {

        this.timeout = timeout;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Fibonacсi numbers do you want to see?");

    // перевіряємо чи введені дані є цілим додатнім числом і заповнюємо ліст
    // потрібною кількістю чисел Фібоначчі. Передаємо ліст в конструктор потоку
        try{
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1));

                if (n > 1) {
                    for (int i = 2; i < n; i++) {
                        numbers.add(numbers.get(i - 2) + numbers.get(i - 1));
                    }
                    this.numbers = numbers;
                }
                else if (n == 1) {
                    numbers.remove(1);
                    this.numbers = numbers;
                }
                else {
                throw new IllegalArgumentException("Incorrect input. Number should be > 0.");
                }
            }
            else {
                throw new IllegalArgumentException("Incorrect input. Quantity must be integer number.");
            }
            } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // перевизначаємо метод run(), виводимо числа в звичайному порядку
    @Override
    public void run() {
        System.out.print("Regular order: ");
        for (int i = 0; i < numbers.size(); i++){
            if (i != numbers.size()-1) {
                System.out.print(numbers.get(i) + ", ");
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println(numbers.get(i)+".");
            }
        }
    }
}
