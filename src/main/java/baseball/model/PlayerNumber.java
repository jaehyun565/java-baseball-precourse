package baseball.model;

import static baseball.model.ConstantNumber.NUMSIZE;

import camp.nextstep.edu.missionutils.Console;

public class PlayerNumber {

	int[] playerNum = new int[NUMSIZE];

	public void inputNumber() {
		String tmp = Console.readLine();

		for (int i = 0; i < playerNum.length; i++) {
			playerNum[i] = tmp.charAt(i) - 48;
			System.out.println(playerNum[i]);
		}
	}

	private void validTest(String number) {
		int testNum = 0;
		// 입력값이 Int로 만들 수 없으면 error
		try {
			testNum = Integer.parseInt(number);
		} catch (IllegalArgumentException e) {
			System.err.println("입력은 숫자값으로 입력하셔야 합니다.");
			return;
		}

		// 자릿수에 맞게 입력했는지 검증
		if (number.length() != NUMSIZE) {
			throw new IllegalArgumentException("입력값이 "+NUMSIZE+"자리가 아닙니다.");
		}

		// 중복문자 있는지 검증
//		for (int i = 0; i < number.length(); i++) {
//			char testWord = number.charAt(i);
//			if(number.contains()){
//
//			}
//		}

	}


}
