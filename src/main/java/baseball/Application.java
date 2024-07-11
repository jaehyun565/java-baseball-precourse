package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    private static int makeRandNum(){
        int randNum = Randoms.pickNumberInRange(0,999);
        boolean check = true;
        while(check){
            if (randNum < 100){
                randNum = Randoms.pickNumberInRange(0,999);
            } else if(randNum/100 == (randNum%100)/10 || randNum/100 == randNum%10 || (randNum%100)/10 == randNum%10){
                randNum = Randoms.pickNumberInRange(0,999);
            } else{
                check = false;
            }
        }
        return randNum;
    }
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        // 1. 3자리수 난수 생성 구현
        int randNum = makeRandNum();

        System.out.println(randNum);
    }
}
