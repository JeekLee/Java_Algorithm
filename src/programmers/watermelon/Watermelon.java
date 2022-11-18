package src.programmers.watermelon;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하시오.(1~1000) > ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println(Solution.solution(n));
    }
}
