package src.programmers.y2016;

import java.util.Scanner;

public class Y2016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;    // 정수 배열
        int day = 0;         // 정수 배열 길이
        while( month < 1 || month > 12){
            System.out.print("a 입력하시오.(1~12) > ");
            month = scanner.nextInt();
            scanner.nextLine();
        }
        while( day < 1 || day > 31){
            System.out.print("a 입력하시오.(1~31 ) > ");
            day = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(Solution.solution(month, day));
    }
}
