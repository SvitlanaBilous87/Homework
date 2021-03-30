package com.company.hometask_21;

import java.util.List;

public class RunnableThread implements Runnable {

    private List<Integer> numbers;
    private long timeout;

    public RunnableThread(List<Integer> numbers, long timeout) {
        this.numbers = numbers;
        this.timeout = timeout;
    }

    // перевизначаємо метод run(), виводимо числа в зворотньому порядку
    @Override
    public void run() {
        System.out.print("Reverse order: ");
        for (int i=numbers.size()-1; i>=0; i--) {
            if (i != 0) {
                System.out.print(numbers.get(i) + ", ");
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(numbers.get(i) + ".");
            }
        }
    }
}
