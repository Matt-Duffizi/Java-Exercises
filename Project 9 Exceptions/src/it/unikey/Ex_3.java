package it.unikey;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number: ");
            double num = scanner.nextInt();
            double rand = Math.random()*3;
            if (rand == 0) throw new ArithmeticException("Can't Divide by 0");
            double result = num / rand;
            System.out.println(result);
    }
}
