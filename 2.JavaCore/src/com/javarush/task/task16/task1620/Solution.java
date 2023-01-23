package com.javarush.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
Thread
*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        Water water = new Water("");
        threads.forEach(Thread::interrupt);
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            boolean isCurrentThreadInterrupted = false;
            String threadName = "";

            try {
                while (!isCurrentThreadInterrupted) {
                    threadName = Thread.currentThread().getName();
                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
            }
        }
    }
}
