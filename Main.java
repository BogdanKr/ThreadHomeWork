package com.company.Work190603.HomeWork;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    MyThread thread = new MyThread();
    //thread.start();
    thread.run();

    Thread thread1 = new Thread(new MyTask());
        thread1.setDaemon(true);
        thread1.start();

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

        Thread thread3 = new Thread(() -> {
            Thread thread4 = new Thread(() -> {
                Thread thread5 = new Thread(() -> {
                    Thread thread6 = new Thread(() -> {
                        Thread thread7 = new Thread(() -> {
                            Thread thread8 = new Thread(() -> {
                                Thread thread9 = new Thread(() -> {
                                    Thread thread10 = new Thread(() -> {
                                        Thread thread11 = new Thread(() -> {
                                            Thread thread12 = new Thread(() -> {

                                            });
                                            System.out.println(Thread.currentThread().getName()+" запsffускаю "+thread12.getName());
                                            thread12.start();
                                        });
                                        System.out.println(Thread.currentThread().getName()+" запускаю "+thread11.getName());
                                        thread11.start();
                                    });
                                    System.out.println(Thread.currentThread().getName()+" запускаю "+thread10.getName());
                                    thread10.start();
                                });
                                System.out.println(Thread.currentThread().getName()+" запускаю "+thread9.getName());
                                thread9.start();
                            });
                            System.out.println(Thread.currentThread().getName()+" запускаю "+thread8.getName());
                            thread8.start();
                        });
                        System.out.println(Thread.currentThread().getName()+" запускаю "+thread7.getName());
                        thread7.start();
                    });
                    System.out.println(Thread.currentThread().getName()+" запускаю "+thread6.getName());
                    thread6.start();
                });
                System.out.println(Thread.currentThread().getName()+" запускаю "+thread5.getName());
                thread5.start();
            });
            System.out.println(Thread.currentThread().getName()+" запускаю "+thread4.getName());
            thread4.start();

        });
        System.out.println(thread3.getName() + " стартую ");
        thread3.start();

    }

}
