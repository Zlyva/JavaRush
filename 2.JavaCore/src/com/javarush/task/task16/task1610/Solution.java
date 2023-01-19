package com.javarush.task.task16.task1610;

/* 
Расставь вызовы методов join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");

        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            try {
                kitten1 = new Kitten("Котенок 1, мама - " + getName());
                kitten1.join();
                kitten2 = new Kitten("Котенок 2, мама - " + getName());
                kitten2.join();
                start();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            sleep(200);
            kitten2.start();
            sleep(200);
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}