package baseball.model;

import static baseball.model.ConstantNumber.NUMSIZE;

import camp.nextstep.edu.missionutils.Console;

public class PlayerNumber {

	int[] playerNum = new int[NUMSIZE];

	public void inputNumber() {
		String tmp = Console.readLine();

		for (int i = 0; i < playerNum.length; i++) {
			playerNum[i] = tmp.charAt(i)-48;
			System.out.println(playerNum[i]);
		}

	}


}
