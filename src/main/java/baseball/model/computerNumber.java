package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

public class computerNumber {

	// 1. 컴퓨터 3자리 랜덤 숫자 생성
	public int[] generateComputerNum() {

		int[] computerNum = new int[3];

		for (int i = 0; i < 3; i++) {
			int randNum = Randoms.pickNumberInRange(1, 9);
			while (computerNum[0] == randNum || computerNum[1] == randNum) {
				randNum = Randoms.pickNumberInRange(1, 9);
			}
			computerNum[i] = randNum;
		}
		return computerNum;
	}

}
