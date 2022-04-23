package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    static boolean isInter = true;

    public static void ourInterruptMethod() throws InterruptedException {
        isInter=false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            try {
                while (isInter) {
                    System.out.println("he-he");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
