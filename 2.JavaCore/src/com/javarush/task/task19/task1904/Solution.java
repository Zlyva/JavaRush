package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
PersonScannerAdapter
*/

public class Solution {

    public static void main(String[] args) {
        //Иванов Иван Иванович 31 12 1950
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String s = fileScanner.nextLine();
            String[] split = s.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4])-1, Integer.parseInt(split[3]));
            Date date = calendar.getTime();

            return new Person(split[1], split[2], split[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
