package com.codegym;

public class Main {

    public static void main(String[] args) {

        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try {
            System.out.println("Số lẻ: ");
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
        try {
            System.out.println("Số chẵn: ");
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
