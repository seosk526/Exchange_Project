package ChangeMoney;

public class OutputClass {
	double USD_RATE = 1134.30;
	double EUR_RATE = 1332.92;
	double JPY_RATE = 1029.16;
	
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
	
	public void outputResultUSD(int amount) {		
		int exUSD = (int)(amount / USD_RATE);
		if (checkBalanceUSD(exUSD)) {
		System.out.println("환전결과 : " + exUSD+ "달러");
		
		int tempUSD = exUSD;
		int[] arrUSD=ConstValueClass.arrUsd;
		for (int i = 0; i < ConstValueClass.arrUsd.length; i++) {
			System.out.println(ConstValueClass.arrUsd[i] + "달러 : " 
			+ tempUSD / ConstValueClass.arrUsd[i] + "장");
			tempUSD = tempUSD % ConstValueClass.arrUsd[i];				
			} 		
		
		int returnKor = (int)(amount % USD_RATE) / 10 * 10;
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
		    + returnKor / ConstValueClass.arrKOR[i] + "개");
			returnKor = returnKor % ConstValueClass.arrKOR[i];
				}	
		ConstValueClass.BALANCE_USD = ConstValueClass.BALANCE_USD - exUSD;	
		System.out.println("환전 후 보유달러 : " + ConstValueClass.BALANCE_USD);
			} else {					
				printErrorMessage(ConstValueClass.ERR_BALANCE_USD);
		}
	}
	
	public void outputResultEUR(int amount) {
		int exEUR = (int)(amount / EUR_RATE);
		if (checkBalanceEUR(exEUR)) {
		System.out.println("환전결과 : " + exEUR + "유로");
				
		int tempEUR = exEUR;
		int [] arrEur = ConstValueClass.arrEur;
		for (int i = 0; i < ConstValueClass.arrEur.length; i++) {
			System.out.println(ConstValueClass.arrEur[i] + "유로 : " 
			+ tempEUR / ConstValueClass.arrEur[i] + "장");
			tempEUR = tempEUR % ConstValueClass.arrEur[i];
			}
		
		int returnKor = (int)(amount % EUR_RATE) / 10 * 10;
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
			+ returnKor / ConstValueClass.arrKOR[i] + "개");
			returnKor = returnKor % ConstValueClass.arrKOR[i];
				} 
		ConstValueClass.BALANCE_EUR = ConstValueClass.BALANCE_EUR - exEUR;	
		System.out.println("환전 후 보유유로 : " + ConstValueClass.BALANCE_EUR);
			} else {
				printErrorMessage(ConstValueClass.ERR_BALANCE_EUR);
		}
	} 
	
	public void outputResultJPY(int amount) {
		int exJPY = (int)(amount / JPY_RATE) * 100;
		if (checkBalanceJPY(exJPY)) {
		System.out.println("환전결과 : " + exJPY + "엔");
				
		int tempJPY = exJPY;
		int[] arrJPY = ConstValueClass.arrJPY;
		for (int i = 0; i < ConstValueClass.arrJPY.length; i++) {
			System.out.println(ConstValueClass.arrJPY[i] + "엔 : " 
			+ tempJPY / ConstValueClass.arrJPY[i]);
			tempJPY = tempJPY % ConstValueClass.arrJPY[i];
			}
		
		int returnKOR = ((int)(amount % JPY_RATE) / 10 * 10);		
		System.out.println("거스름돈 : " + returnKOR + "원");			
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
			+ returnKOR / ConstValueClass.arrKOR[i]);
			returnKOR = returnKOR % ConstValueClass.arrKOR[i];
				}
		ConstValueClass.BALANCE_JPY = ConstValueClass.BALANCE_JPY - exJPY;	
		System.out.println("환전 후 보유엔화 : " + ConstValueClass.BALANCE_JPY);
			} else {
				printErrorMessage(ConstValueClass.ERR_BALANCE_JPY);
		}
	}	

	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstValueClass.ERR_BALANCE_USD:
				System.out.print("달러 ");
				break;
			case ConstValueClass.ERR_BALANCE_EUR:
				System.out.print("유로 ");
				break;
			case ConstValueClass.ERR_BALANCE_JPY:
				System.out.print("앤화 ");
				break;
		}
		System.out.println("보유 잔액이 부족합니다.");
	}
}