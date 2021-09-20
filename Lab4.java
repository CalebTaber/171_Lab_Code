/*
 * Caleb Taber
 * 09/20/2021
 */

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        boolean part1 = false;
        boolean part2 = false;
        boolean part3 = false;
        boolean part4 = true;

        if (part1) {
            Scanner scan = new Scanner(System.in);

            do {
                int input = scan.nextInt();

                if (input == 0) {
                    scan.close();
                    break;
                }

                System.out.println(Math.pow(input, 2));
            } while (scan.hasNext());

            scan.close();
        }

        if (part2) {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= input; j++) {
                    System.out.print("\t" + (i * j));
                }

                System.out.println();
            }

            scan.close();
        }

        if (part3) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter three numbers. (All three as 0 to exit)");
            int in1 = scan.nextInt();
            int in2 = scan.nextInt();
            int in3 = scan.nextInt();

            while (in1 != 0 && in2 != 0 && in3 != 0) {

                for (int i = in1; i <= in2; i += in3) {
                    System.out.println("\t" + i);
                }

                System.out.println("Enter three numbers. (All three as 0 to exit)");

                in1 = scan.nextInt();
                in2 = scan.nextInt();
                in3 = scan.nextInt();
            }

            scan.close();
        }

        if (part4) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int input = scan.nextInt();

            double sum = 0;
            for (int i = 1; i <= input; i++) {
                if (i % 2 == 0) sum -= 1.0 / (double)i;
                else sum += 1.0 / (double) i;
            }

            System.out.println("Calculated sum: " + sum);
            System.out.println("Math.log(2): " + Math.log(2));

            scan.close();
        }
    }
}
