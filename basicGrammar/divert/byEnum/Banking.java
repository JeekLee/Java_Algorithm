package basicGrammar.divert.byEnum;

import basicGrammar.divert.Account;
import java.util.Arrays;

public enum Banking {
    DEPOSIT(1){
        @Override
        public void operation(){
            Account.deposit();
        }
    },
    WITHDRAW(2){
        @Override
        public void operation(){
            Account.withdraw();
        }
    },
    BALANCE(3){
        @Override
        public void operation(){
            Account.getBalance();
        }
    },
    QUIT(4){
        @Override
        public void operation(){
            Account.killProcess();
        }
    };

    private final int operationCode;


    // 생성자
    Banking(int operationCode){
        this.operationCode = operationCode;
    }
    public static Banking of(int code) {
        return Arrays.stream(Banking.values())
                .filter(opcode -> opcode.operationCode == code)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("해당하는 Operation Code가 존재하지 않습니다."));
    }

    public abstract void operation();
}
