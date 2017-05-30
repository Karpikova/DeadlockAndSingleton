package com.company;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 30.05.2017
 * 
 * Karpikova
 */
public class Deadlock {

    public static void main(String[] args) {
        ObjectToCreateDeadlock objectToCreateDeadlock_1 = new ObjectToCreateDeadlock();
        ObjectToCreateDeadlock objectToCreateDeadlock_2 = new ObjectToCreateDeadlock();

        DeadlockSon deadlockSon = new DeadlockSon(objectToCreateDeadlock_1, objectToCreateDeadlock_2);
        DeadlockDauhter deadlockDauhter = new DeadlockDauhter(objectToCreateDeadlock_1, objectToCreateDeadlock_2);

        Thread thread_Son = new Thread(deadlockSon);
        Thread thread_Daughter = new Thread(deadlockDauhter);
        thread_Son.start();
        thread_Daughter.start();
    }
}
