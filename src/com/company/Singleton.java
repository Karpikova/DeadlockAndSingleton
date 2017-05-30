package com.company;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 28.05.2017
 * 
 * Karpikova
 */
public class Singleton {
    private static Singleton instance;

    /**
     * Threadsave. Gonna be...
     * @return
     */
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
