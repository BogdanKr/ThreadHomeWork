package com.company.Work190603.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        MyThread thread = new MyThread();
//        thread.start();
//        //thread.run();
//
//        Thread thread1 = new Thread(new MyTask());
//        thread1.setDaemon(true);
//        thread1.start();

//    Thread thread2 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName());
//            for (int i = 1; i <=10000 ; i++) {
//                System.out.print(i);
//            }
//        }
//    });
//    thread2.start();
//    thread2.join();
        List<Thread> list = new ArrayList<>();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                Thread thread4 = new Thread();
                list.add(thread4);
                System.out.println(list.get(i).getName() + " стартую " + thread4.getName());
                thread4.start();
            }
        });
        list.add(thread3);
        thread3.start();

    }

}
