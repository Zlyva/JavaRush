package com.javarush.task.task16.task1619;

/* 
interrupt ?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.isTestThread = false;
    }

    public static class TestThread implements Runnable {
        public static boolean isTestThread = true;
        public void run() {
            while (isTestThread) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
