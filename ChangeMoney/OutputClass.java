package ChangeMoney;

import java.io.FileWriter;
import java.io.IOException;

public class OutputClass {
   
	private boolean checkBalanceUSD(int requestUSD) {
		if (requestUSD <= ConstValueClass.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}
	private boolean checkBalanceEUR(int requestEUR) {
		if (requestEUR <= ConstValueClass.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}
	private boolean checkBalanceJPY(int requestJPY) {
		if (requestJPY <= ConstValueClass.BALANCE_JPY) {
			return true;
		} else {
			return false;
		}
	}
	
	public void outputResultUSD(int amount) throws Exception {
		int exUSD = (int) (amount / ConstValueClass.USD_RATE);
		String saveText = new String();                                      // 파일에 입력되어야 하는 값을 모두 담을 String saveText 변수 생성
		saveText = "";
		if (checkBalanceUSD(exUSD)) {
			String tmp1 = "환전결과 : " + exUSD + "달러\n";    //출력해야 될 값을 String 값으로 지정
			saveText += tmp1;                                                         // saveText에 추가

			int tempUSD = exUSD;
			int[] arrUSD = ConstValueClass.arrUsd;
			for (int i = 0; i < ConstValueClass.arrUsd.length; i++) {
				String tmp2 = ConstValueClass.arrUsd[i] + "달러 : " + tempUSD / ConstValueClass.arrUsd[i] + "장\n";   //출력해야 될 값을 String 값으로 지정
				saveText += tmp2;                                                                                                                                                              // saveText에 추가
				tempUSD = tempUSD % ConstValueClass.arrUsd[i];
			}

			int returnKor = (int) (amount % ConstValueClass.USD_RATE) / 10 * 10;
			String tmp3 = "거스름돈 : " + returnKor + "원\n";   // 출력해야 될 값을 String 값으로 지정
			saveText += tmp3;                                                          // saveText에 추가

			int[] arrKor = ConstValueClass.arrKOR;
			for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
				String tmp4 = ConstValueClass.arrKOR[i] + "원 : " + returnKor / ConstValueClass.arrKOR[i] + "개\n";   // 출력해야 될 값을 String 값으로 지정
				saveText += tmp4;                                                                                                                                                            // saveText에 추가
				returnKor = returnKor % ConstValueClass.arrKOR[i];
			}
			ConstValueClass.BALANCE_USD = ConstValueClass.BALANCE_USD - exUSD;
			String tmp5 = "환전 후 보유달러 : " + ConstValueClass.BALANCE_USD + "\n";  // 출력해야 될 값을 String 값으로 지정
			saveText += tmp5;                                                                                                             // saveText에 추가
			System.out.println(saveText);                                                                                      // 모든 변수가 추가된 saveText 출력
		} else {
			printErrorMessage(ConstValueClass.ERR_BALANCE_USD);                               //
		}
		FileStringGetter filestring = new FileStringGetter();   //
		filestring.printSaveText(saveText);
	}

	public void outputResultEUR(int amount) throws Exception {
		String saveText = new String();
		saveText = "";
		int exEUR = (int) (amount / ConstValueClass.EUR_RATE);
		if (checkBalanceEUR(exEUR)) {
			String tmp1 = "환전결과 : " + exEUR + "유로\n";
			saveText += tmp1;

			int tempEUR = exEUR;
			int[] arrEur = ConstValueClass.arrEur;
			for (int i = 0; i < ConstValueClass.arrEur.length; i++) {
				String tmp2 = ConstValueClass.arrEur[i] + "유로 : " + tempEUR / ConstValueClass.arrEur[i] + "장\n";
				saveText += tmp2;
				tempEUR = tempEUR % ConstValueClass.arrEur[i];
			}

			int returnKor = (int) (amount % ConstValueClass.EUR_RATE) / 10 * 10;
			String tmp3 = "거스름돈 : " + returnKor + "원\n";
			saveText += tmp3;
			int[] arrKor = ConstValueClass.arrKOR;
			for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
				String tmp4 = ConstValueClass.arrKOR[i] + "원 : " + returnKor / ConstValueClass.arrKOR[i] + "개\n";
				saveText += tmp4;
				returnKor = returnKor % ConstValueClass.arrKOR[i];
			}
			ConstValueClass.BALANCE_EUR = ConstValueClass.BALANCE_EUR - exEUR;
			String tmp5 = "환전 후 보유유로 : " + ConstValueClass.BALANCE_EUR + "\n";
			saveText += tmp5;
			System.out.println(saveText);
		} else {
			printErrorMessage(ConstValueClass.ERR_BALANCE_EUR);
		}
		FileStringGetter filestring = new FileStringGetter();
		filestring.printSaveText(saveText);
	}

	public void outputResultJPY(int amount) throws Exception {
		String saveText = new String();
		saveText = "";
		int exJPY = (int) (amount / ConstValueClass.JPY_RATE) * 100;
		if (checkBalanceJPY(exJPY)) {
			String tmp1 = "환전결과 : " + exJPY + "엔\n";
			saveText += tmp1;

			int tempJPY = exJPY;
			int[] arrJPY = ConstValueClass.arrJPY;
			for (int i = 0; i < ConstValueClass.arrJPY.length; i++) {
				String tmp2 = ConstValueClass.arrJPY[i] + "엔 : " + tempJPY / ConstValueClass.arrJPY[i] + "장\n";
				saveText += tmp2;
				tempJPY = tempJPY % ConstValueClass.arrJPY[i];
			}

			int returnKOR = ((int) (amount % ConstValueClass.JPY_RATE) / 10 * 10);
			String tmp3 = "거스름돈 : " + returnKOR + "원\n";
			saveText += tmp3;
			int[] arrKor = ConstValueClass.arrKOR;
			for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
				String tmp4 = ConstValueClass.arrKOR[i] + "원 : " + returnKOR / ConstValueClass.arrKOR[i] + "개\n";
				saveText += tmp4;
				returnKOR = returnKOR % ConstValueClass.arrKOR[i];
			}
			ConstValueClass.BALANCE_JPY = ConstValueClass.BALANCE_JPY - exJPY;
			String tmp5 = "환전 후 보유엔화 : " + ConstValueClass.BALANCE_JPY + "\n";
			saveText += tmp5;
			System.out.println(saveText);
		} else {
			printErrorMessage(ConstValueClass.ERR_BALANCE_JPY);
		}
		FileStringGetter filestring = new FileStringGetter();
		filestring.printSaveText(saveText);
	}

	public void printErrorMessage(int errorCode) throws Exception {
		String saveText = new String();
		saveText = "";
		switch (errorCode) {
		case ConstValueClass.ERR_BALANCE_USD:
			String tmp1 = "달러 \n";
			saveText += tmp1;
			break;
		case ConstValueClass.ERR_BALANCE_EUR:
			String tmp2 = "유로 \n";
			saveText += tmp2;
			break;
		case ConstValueClass.ERR_BALANCE_JPY:
			String tmp3 = "앤화 \n";
			saveText += tmp3;
			break;
		}
		String tmp4 = "보유 잔액이 부족합니다.\n";
		saveText += tmp4;
		System.out.println(saveText);
		FileStringGetter filestring = new FileStringGetter();
		filestring.printSaveText(saveText);
	}
}