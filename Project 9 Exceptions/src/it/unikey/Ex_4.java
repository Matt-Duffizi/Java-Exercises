package it.unikey;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        try {
            System.out.println("What number do you wish to insert?");
            int number = scanner.nextInt();
            System.out.println("What will be its index?");
            int index = scanner.nextInt();
            array[index] = number;
        } catch (Exception e){
            System.out.println("Value Outside array index limits");
        }

        for (int num: array) {
            System.out.println(num);
        }

    }
}
