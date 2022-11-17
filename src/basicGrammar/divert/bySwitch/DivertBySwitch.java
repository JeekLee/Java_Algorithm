package src.basicGrammar.divert.bySwitch;

import src.basicGrammar.divert.Account;

import java.util.Scanner;

public class DivertBySwitch {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2. 출금 | 3. 잔액 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            int tmp = scanner.nextInt();
            scanner.nextLine();

            switch(tmp){
                case 1:
                    Account.deposit();
                    break;

                case 2:
                    Account.withdraw();
                    break;

                case 3:
                    Account.getBalance();
                    break;

                case 4:
                    Account.killProcess();
                    break;

                default:
                    System.out.println("1~4 사이의 숫자를 입력하세요.");
                    break;

            }
        }
    }
}
