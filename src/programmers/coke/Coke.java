package src.programmers.coke;

import java.util.Scanner;

public class Coke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;  // 빈병 a개를 주면
        int b = 0;  // 콜라 b개를 준다
        int n = 0;  // 가지고 있는 병의 갯수

        while( a < 1 || a > 10000000){
            System.out.print("a를 입력하시오. > ");
            a = scanner.nextInt();
            scanner.nextLine();
        }
        while( b < 1 || b > 10000000) {
            System.out.print("b를 입력하시오. > ");
            b = scanner.nextInt();
            scanner.nextLine();
        }
        while( n < 1 || n > 10000000) {
            System.out.print("n를 입력하시오. > ");
            n = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("result: " + Solution.solution(a,b,n));
    }
}
