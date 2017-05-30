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
public class DeadlockDauhter implements Runnable {

    private ObjectToCreateDeadlock objectToCreateDeadlock_1;
    private ObjectToCreateDeadlock objectToCreateDeadlock_2;

    public ObjectToCreateDeadlock getObjectToCreateDeadlock_1() {
        return objectToCreateDeadlock_1;
    }

    public void setObjectToCreateDeadlock_1(ObjectToCreateDeadlock objectToCreateDeadlock_1) {
        this.objectToCreateDeadlock_1 = objectToCreateDeadlock_1;
    }

    public ObjectToCreateDeadlock getObjectToCreateDeadlock_2() {
        return objectToCreateDeadlock_2;
    }

    public void setObjectToCreateDeadlock_2(ObjectToCreateDeadlock objectToCreateDeadlock_2) {
        this.objectToCreateDeadlock_2 = objectToCreateDeadlock_2;
    }

    public DeadlockDauhter(ObjectToCreateDeadlock objectToCreateDeadlock_1, ObjectToCreateDeadlock objectToCreateDeadlock_2) {
        this.objectToCreateDeadlock_1 = objectToCreateDeadlock_1;
        this.objectToCreateDeadlock_2 = objectToCreateDeadlock_2;
    }

    @Override
    public void run() {
        synchronized (objectToCreateDeadlock_2){
            System.out.println("Daughter got obj 2");
            synchronized (objectToCreateDeadlock_1){
                System.out.println("Daughter got obj 1");
            }
        }
    }
}
