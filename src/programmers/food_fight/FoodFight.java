package src.programmers.food_fight;

import java.util.Scanner;

public class FoodFight {
    public static String addnum(String answer, int count, int foodnum){
        for (int i = 0; i < count; i++) {
            answer = foodnum + answer + foodnum;
        }
        return answer;
    }
    public static String solution(int[] food){
        String answer = "0";
        for (int i = food.length-1 ; i > 0 ; i--){
            int count = food[i]/2;
            answer = addnum(answer, count, i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        while( m < 2 || m > 9){
            System.out.print("food의 길이를 입력하시오. (2~9)> ");
            m = scanner.nextInt();
            scanner.nextLine();
        }
        int[] food = new int[m];

        for (int i = 0; i< m; i++){
            int k = 0;
            while ( k < 1 || k > 1000){
                System.out.printf("%d번 째 음식의 수를 입력하시오. (1~1000)> ", i+1);
                k = scanner.nextInt();
                scanner.nextLine();
                food[i] = k;
            }
        }

        System.out.println(solution(food));
    }
}
