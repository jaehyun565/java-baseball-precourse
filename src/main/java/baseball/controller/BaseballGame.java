package baseball.controller;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {

	private static int makeRandNum() {
		int randNum = Randoms.pickNumberInRange(0,999);

		Randoms.pickNumberInRange(0, 999);
		boolean check = true;
		while (check) {
			if (randNum < 100) {
				randNum = Randoms.pickNumberInRange(0, 999);
			} else if (randNum / 100 == (randNum % 100) / 10 || randNum / 100 == randNum % 10
				|| (randNum % 100) / 10 == randNum % 10) {
				randNum = Randoms.pickNumberInRange(0, 999);
			} else {
				check = false;
			}
		}
		return randNum;
	}

}
