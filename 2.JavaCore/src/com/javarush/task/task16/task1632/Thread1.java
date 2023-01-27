package com.javarush.task.task16.task1632;

public class Thread1 extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
