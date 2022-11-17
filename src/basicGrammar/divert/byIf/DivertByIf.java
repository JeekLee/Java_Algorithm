package src.basicGrammar.divert.byIf;
import src.basicGrammar.divert.Account;

import java.util.Scanner;

public class DivertByIf {
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

            if (tmp == 1){
                Account.deposit();
            }
            else if (tmp == 2) {
                Account.withdraw();
            }
            else if (tmp == 3) {
                Account.getBalance();
            }
            else if (tmp == 4) {
                Account.killProcess();
            }
            else{
                System.out.println("1~4 사이의 숫자를 입력하세요.");
            }
        }
    }
}
