package com.javarush.task.task16.task1632;

public class Thread3 extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
