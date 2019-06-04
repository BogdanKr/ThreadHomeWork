package com.company.Work190603.HomeWork;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        while (true){
//            System.out.print(8);
//        }
    }
}
