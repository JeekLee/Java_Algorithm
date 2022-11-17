package src.basicGrammar.divert.byEnum;

import java.util.Scanner;

public class DivertByEnum {
    public static void main(String[] args) throws Exception {
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2. 출금 | 3. 잔액 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            int opnum = scanner.nextInt();
            scanner.nextLine();
            Banking bank = Banking.of(opnum);
            bank.operation();
        }
    }
}
