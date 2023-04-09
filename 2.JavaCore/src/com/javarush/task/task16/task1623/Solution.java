package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import static java.lang.String.valueOf;

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        TestThread myThread = new TestThread("my thread");
    }

    public static class TestThread extends Thread {
        public TestThread(String name) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(getName());
        }
    }
}

//    public static class GenerateThread extends Thread {
//        public GenerateThread() {
//            super(String.valueOf(++createdThreadCount));
//            this.start();
//        }
//
//        @Override
//        public void run() {
//            while (Solution.count < 15) {
//                System.out.println(new GenerateThread());
//            }
//
//        }
//
//        @Override
//        public String toString() {
//            return createdThreadCount + this.getName();
//        }
//    }
//}
