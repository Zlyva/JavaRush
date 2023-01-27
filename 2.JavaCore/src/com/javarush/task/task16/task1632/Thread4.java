package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void showWarning() {
        if (isAlive()) {
            interrupt();
        }
    }
}
