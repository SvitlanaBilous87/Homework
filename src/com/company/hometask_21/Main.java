package com.company.hometask_21;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // створюємо 2 потоки, для MyThread отримуємо сканером кількість чисел, заповнюємо ліст,
        // а runnableThread в конструктор геттером отримує готовий ліст
        MyThread myThread = new MyThread(1000);
        Thread runnableThread = new Thread(new RunnableThread(myThread.getNumbers(), 1000));

        // запускаємо потоки, runnableThread почнеться тоді, коли завершиться MyThread
        myThread.start();
        myThread.join();
        runnableThread.start();
    }
}
