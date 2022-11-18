package src.programmers.marathon;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("전체 선수의 숫자를 입력하시오. > ");
        int m = scanner.nextInt();
        String[] participant = new String[m];
        String[] completion = new String[m-1];
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            System.out.printf("%d 번째 참가한 선수의 이름을 입력하시오. > ", i);
            participant[i] = scanner.nextLine();
        }
        for (int i = 0; i < m-1; i++) {
            System.out.printf("%d 번째 완주한 선수의 이름을 입력하시오. > ", i);
            completion[i] = scanner.nextLine();
        }
        System.out.println(Solution.solution(participant, completion));
    }
}
