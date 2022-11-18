package src.programmers.divisor;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array에 들어갈 정수의 수 > ");
        int m = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[m];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array에 들어갈 %d번째 정수  > ", i);
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Divisor > ");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        System.out.println(Solution.solution(arr, divisor)[0]);
    }
}
