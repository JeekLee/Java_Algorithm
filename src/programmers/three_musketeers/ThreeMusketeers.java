package src.programmers.three_musketeers;

import java.util.Scanner;

public class ThreeMusketeers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = null;    // 정수 배열
        int length = 0;         // 정수 배열 길이
        while( length < 3 || length > 13){
            System.out.print("학생의 숫자를 입력하시오.(3~13) > ");
            length = scanner.nextInt();
            scanner.nextLine();
            number = new int[length];
        }
        for (int i = 0; i < length; i++) {
            int tmp = -2000;
            while (tmp < -1000 || tmp > 1000) {
                System.out.printf("%d번째 정수 번호를 입력하세요.(-1000 ~ 1000) > ", i + 1);
                tmp = scanner.nextInt();
                scanner.nextLine();
                number[i] = tmp;
            }
        }
        System.out.println(Solution.solution(number));
    }
}
