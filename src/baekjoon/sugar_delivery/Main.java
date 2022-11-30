package src.baekjoon.sugar_delivery;

import java.util.Scanner;

public class Main {
    public static int calc(int x) {
        boolean flag = false;

        int three = 0;
        int five = 0;

        // 5kg으로 최대한 봉지를 구성
        for (int i = x/5; i >= 0; i--) {
            if ((x-i*5)%3 == 0){
                five = i;
                three = (x-i*5)/3;
                flag = true;
                break;
            }
        }

        if (flag){
            return three+five;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println(calc(x));
    }
}
