
import java.util.Scanner;

public class NumberLogic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // =========================
        // Prime Number
        // =========================

        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a != 1) {
            int count = 0;

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }

            if (count > 2) {
                System.out.println("Not prime number");
            } else {
                System.out.println("Prime number");
            }
        } else {
            System.out.println("Not prime number");
        }


        // =========================
        // Print Primes from 1 to N
        // =========================

        System.out.println("Enter a number");
        int p = sc.nextInt();

        for (int k = 1; k <= p; k++) {

            int b = k;

            if (b != 1) {

                int count2 = 0;

                for (int i = 1; i <= b; i++) {
                    if (b % i == 0) {
                        count2++;
                    }
                }

                if (count2 <= 2) {
                    System.out.println(b);
                }
            }
        }


        // =========================
        // Armstrong Number
        // =========================

        System.out.println("Enter a number");
        int c = sc.nextInt();

        int original = c;
        int count = 0;

        while (c > 0) {
            c = c / 10;
            count++;
        }

        c = original;

        int sum = 0;

        while (c > 0) {

            int rem = c % 10;

            sum = sum + (int) Math.pow(rem, count);

            c = c / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }


        // =========================
        // Print Armstrong Numbers
        // =========================

        System.out.println("Enter a number");
        int p2 = sc.nextInt();

        for (int i = 1; i <= p2; i++) {

            int d = i;
            int original3 = d;
            int count3 = 0;

            while (d > 0) {
                d = d / 10;
                count3++;
            }

            d = original3;

            int sum3 = 0;

            while (d > 0) {

                int rem2 = d % 10;

                sum3 = sum3 + (int) Math.pow(rem2, count3);

                d = d / 10;
            }

            if (original3 == sum3) {
                System.out.println(original3);
            }
        }


        // =========================
        // Perfect Number
        // =========================

        System.out.println("Enter a number");
        int d = sc.nextInt();

        int original4 = d;
        int sum4 = 0;

        for (int i = 1; i <= d; i++) {

            if (d % i == 0) {
                sum4 = sum4 + i;
            }
        }

        int temp = sum4 - original4;

        if (temp == original4) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("Not a perfect number");
        }


        // =========================
        // Strong Number
        // =========================
        // Example:
        // 145
        // 1! + 4! + 5!
        // 1 + 24 + 120
        // 145

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int original5 = n;
        int sum5 = 0;

        while (n > 0) {

            int digit = n % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum5 = sum5 + factorial;

            n = n / 10;
        }

        if (sum5 == original5) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }


        // =========================
        // Neon Number
        // =========================

        System.out.println("Enter a number");
        int ab = sc.nextInt();

        int square = ab * ab;
        int original7 = ab;
        int rem = 0;

        while (square > 0) {

            int temp4 = square % 10;

            rem = rem + temp4;

            square = square / 10;
        }

        if (original7 == rem) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a neon number");
        }


        // =========================
        // Automorphic Number
        // =========================

        System.out.println("Enter a number");
        int d2 = sc.nextInt();

        int square2 = d2 * d2;

        if (square2 % 10 == d2) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an automorphic number");
        }


        // =========================
        // Duck Number
        // =========================

        System.out.println("Enter a number");
        int b2 = sc.nextInt();

        int original77 = b2;
        boolean foundZero = false;

        while (b2 > 0) {

            int digit = b2 % 10;

            if (digit == 0) {
                foundZero = true;
                break;
            }

            b2 = b2 / 10;
        }

        if (foundZero) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }


        // =========================
        // Spy Number
        // =========================

        System.out.println("Enter a number");
        int m = sc.nextInt();

        int original55 = m;

        int sum55 = 0;
        int product = 1;

        while (m > 0) {

            int digit = m % 10;

            sum55 = sum55 + digit;

            product = product * digit;

            m = m / 10;
        }

        if (sum55 == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }


        // Close Scanner at the very end
        sc.close();
    }
}