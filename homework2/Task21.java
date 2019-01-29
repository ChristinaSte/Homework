package homework2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();

        public static long fibonacci(int n) {
                if (n <= 1) return n;
                else return fibonacci(n - 1) + fibonacci(n - 2);
            }

            public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                for (int i = 1; i <= n; i++)
                    System.out.println(i + ": " + fibonacci(i));
            }
        }
    }
