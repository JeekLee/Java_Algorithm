package src.baekjoon.addition_cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int result = 0;
        int tmp = x;
        do {
            result++;
            tmp = checkCondition(tmp);
        }while(tmp!=x);

        System.out.println(result);
    }
    private static int checkCondition(int x) {
        int[] arr = new int[2];
        if (x <10){
            arr[1] = x;
        }
        else{
            arr[0] = (x/10) % 10;
            arr[1] = x%10;
        }
        return arr[1]*10 + (arr[0]+ arr[1])%10;
    }
}
