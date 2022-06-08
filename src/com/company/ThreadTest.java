package com.company;

public class ThreadTest {
    public static class MyThread extends Thread {
        @Override
        public void run() {
//            super.run();
            System.out.println("I am a Thread");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();
    }
}
