package Streams;

import java.util.Scanner;

public class SumWithException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int sum = a + b;

            System.out.println("Sum = " + sum);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
