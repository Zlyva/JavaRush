package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (new IMF()) {
            if(imf == null){
                imf = new IMF();
            }
        return imf;
        }
    }

    private IMF() {
    }
}
