package com.company.Work190603.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {

            Thread thread = new Thread(() -> {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            });
            thread.setName("MyThread-"+j);
            list.add(thread);
        }

        for (Thread t:list) {
            t.start();
            t.join();
        }

    }
}
