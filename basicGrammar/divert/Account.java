package basicGrammar.divert;

import java.util.Scanner;

public class Account {
    // field
    static int balance;

    // constructor
    public Account(){
        balance = 0;
    }
    // method
    static public void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("예금액> ");
        int credit = scanner.nextInt();
        balance = balance + credit;
    }

    static public void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액> ");
        int credit = scanner.nextInt();
        if (balance - credit < 0){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance = balance - credit;
    }

    static public void getBalance(){
        System.out.printf("잔액> %d\n", balance);
    }

    static public void killProcess(){
        System.out.println("프로그램 종료.");
        System.exit(0);
    }
}