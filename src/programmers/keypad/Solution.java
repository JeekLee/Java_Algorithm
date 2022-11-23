package src.programmers.keypad;

public class Solution {
    static public class FingerIndex {
        // field
        private int[] rFinger = {3,2};
        private int[] lFinger = {3,0};

        // constructor
        public FingerIndex() {

        }

        // getter and setter
        public int[] getrFinger() {
            return rFinger;
        }
        public void setrFinger(int[] rFinger) {
            this.rFinger = rFinger;
        }
        public int[] getlFinger() {
            return lFinger;
        }
        public void setlFinger(int[] lFinger) {
            this.lFinger = lFinger;
        }

        // method to get distance between given number index and rFinger
        int getDistance_rFinger(int[] numIndex){
            return Math.abs(numIndex[0]-this.rFinger[0]) + Math.abs(numIndex[1]-this.rFinger[1]);
        }
        int getDistance_lFinger(int[] numIndex) {
            return Math.abs(numIndex[0] - this.lFinger[0]) + Math.abs(numIndex[1] - this.lFinger[1]);
        }

        // method to get distance between given number index and rFinger
        public char whichFinger(int[] numIndex, String hand){
            // 1, 4, 7을 입력할 땐 왼쪽 손가락
            if (numIndex[1] == 0){
                setlFinger(numIndex);
                return 'L';
            }
            // 3, 6, 9를 입력할 땐 오른쪽 손가락
            if (numIndex[1] == 2){
                setrFinger(numIndex);
                return 'R';
            }

            // 2, 5, 8, 0을 입력할 때
            if (getDistance_rFinger(numIndex) > getDistance_lFinger(numIndex)){
                setlFinger(numIndex);
                return 'L';
            }
            else if (getDistance_rFinger(numIndex) == getDistance_lFinger(numIndex)){
                if(hand.equals("left")){
                    setlFinger(numIndex);
                    return 'L';
                }
            }
            setrFinger(numIndex);
            return 'R';
        }
    }

    // method to set index of given number
    static public int[] setIndex(int num){
        int[] result = new int[2];
        if (num==0){
            result[0] = 3;
            result[1] = 1;
            return result;
        }
        result[0] = (num-1)/3;
        result[1] = (num-1)%3;
        return result;
    }

    static public String solution(int[] numbers, String hand) {
        String answer = "";

        FingerIndex fingerindex = new FingerIndex();
        for (int i = 0; i < numbers.length; i++) {
            answer = answer + fingerindex.whichFinger(setIndex(numbers[i]), hand);
        }
        return answer;
    }
}
