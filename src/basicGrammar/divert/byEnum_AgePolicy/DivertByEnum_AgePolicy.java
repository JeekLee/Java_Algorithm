package src.basicGrammar.divert.byEnum_AgePolicy;

import java.util.Scanner;


public class DivertByEnum_AgePolicy {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("나이를 입력하세요.> ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("요금을 입력하세요.> ");
        int fare = scanner.nextInt();
        scanner.nextLine();

        AgePolicy input = AgePolicy.of(age);
        System.out.print(input.calculateFareAppliedAgePolicy(fare));
    }
}
