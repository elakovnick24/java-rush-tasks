package com.javarush.task.task16.task1601;

/* 
My first thread
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread(); //сущность, реализующая Runnable
        new Thread(task).start(); //передача этой сущности аргументом в новую нить, запуск
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
