package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

// 1. 컴퓨터 3자리 랜덤 숫자 생성
public class computerNumber {

	private final int NUMSIZE = 3;

	int[] computerNum = new int[NUMSIZE];

	private computerNumber() {
		clearNum();
	}

	public void clearNum() {
		for (int i = 0; i < computerNum.length; i++) {
			computerNum[i] = 0;
		}
	}

	public void generateComputerNum() {
		for (int i = 0; i < 3; i++) {
			int randNum = Randoms.pickNumberInRange(1, 9);
			while (computerNum[0] == randNum || computerNum[1] == randNum) {
				randNum = Randoms.pickNumberInRange(1, 9);
			}
			computerNum[i] = randNum;
		}
	}

}
