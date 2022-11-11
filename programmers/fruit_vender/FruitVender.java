// 사과는 상태에 따라 1점부터 k점까지 받는다.
// 사과는 한 상자에 m개씩 들어간다.
// 사과 한 상자의 가격은 '최하품 사과' * '사과의 갯수'다.
// 사과는 상자단위로만 판매하며, 남는 사과는 버린다.
// 점수는 3 ~ 9점까지 부여할 수 있다.
// 상자 안에 들어가는 사과의 후는 3 ~ 10개이다.
// 입력 가능한 사과의 갯수는 7개에서 1000000개이다.

package programmers.fruit_vender;

import java.util.Scanner;

import java.util.Random;

public class FruitVender {

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int m = 0;          // 한 상자에 들어갈 사과의 갯수
        int amount = 0;     // 포장할 사과의 갯수
        int k = 0;          // 사과 점수의 최댓값
        int[] scores = null; // 사과 점수 array

        while( m < 3 || m > 10){
            System.out.print("한 상자에 들어갈 사과의 갯수를 입력하시오.(3~10) > ");
            m = scanner.nextInt();
            scanner.nextLine();
        }
        while (amount < 7 || amount > 1000000){
            System.out.print("포장할 사과의 갯수를 입력하시오.(7~1000000) > ");
            amount = scanner.nextInt();
            scanner.nextLine();
            scores = new int[amount];
        }
        while (k<1 || k>9){
            System.out.print("사과 점수의 최댓값을 입력하시오(3~9). > ");
            k = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < amount; i++){
            int score = 0;
            while (score <= 0 || score > k){
                System.out.printf("%d번째 사과의 점수를 입력하시오.(1~%d) > ", i+1, k);
                score = scanner.nextInt();
                scanner.nextLine();
                scores[i] = score;
            }
        }

        // Sorting Algorithm Performance Test
//        int m = 9;          // 한 상자에 들어갈 사과의 갯수
//        int amount = 100000;     // 포장할 사과의 갯수
//        int k = 7;          // 사과 점수의 최댓값
//        int[] scores = new int[amount]; // 사과 점수 array
//        int[] scores2 = new int[amount]; // 사과 점수 array
//        Random random = new Random();
//        for (int i = 0; i < amount; i++){
//            scores[i] = random.nextInt(7)+1;
//            scores2[i] = scores[i];
//            if (i % 10000 == 0){
//                System.out.printf("난수 생성 : %d0 퍼센트 완료\n", i/10000);
//            }
//        }
//        SortedArray sortedScores2 = new SortedArray(scores2, amount);
//        sortedScores2.SelectionSortD();
//        int result2 = 0;
//        for (int i = 0; i < amount/m; i++){
//            int worstApple = 10;
//            for (int j = 0; j < m; j++){
//                if (worstApple > sortedScores2.array[m*i+j]){
//                    worstApple = sortedScores2.array[m*i+j];
//                }
//            }
//            result2 = result2 + worstApple * m;
//        }
//        System.out.printf("Result: %d\n", result2);

        SortedArray sortedScores = new SortedArray(scores, amount);
        sortedScores.InsertionSortD();

        for (int i = 0; i < amount/m; i++){
            int worstApple = 10;
            for (int j = 0; j < m; j++){
                if (worstApple > sortedScores.array[m*i+j]){
                    worstApple = sortedScores.array[m*i+j];
                }
            }
            result = result + worstApple * m;
        }
        System.out.printf("Result: %d\n", result);
    }
}
