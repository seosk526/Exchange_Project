package ChangeMoney;

public class OutputClass {
	double USD_RATE = 1134.30;
	double EUR_RATE = 1332.92;
	double JPY_RATE = 1029.16;
	
	public void outputResultUSD(int amount) {
		int exUSD = (int)(amount / USD_RATE);
		System.out.println("환전결과 : " + exUSD+ "달러");
		int[] arrUSD=ConstValueClass.arrUsd;
		for (int i = 0; i < ConstValueClass.arrUsd.length; i++) {
			System.out.println(ConstValueClass.arrUsd[i] + "달러 : " 
			+ exUSD / ConstValueClass.arrUsd[i] + "장");
			exUSD = exUSD % ConstValueClass.arrUsd[i];
		}		
	}
	
	public void outputResultEUR(int amount) {
		int exEUR = (int)(amount / EUR_RATE);
		System.out.println("환전결과 : " + exEUR + "유로");
		int [] arrEur = ConstValueClass.arrEur;
		for (int i = 0; i < ConstValueClass.arrEur.length; i++) {
			System.out.println(ConstValueClass.arrEur[i] + "유로 : " 
			+ exEUR / ConstValueClass.arrEur[i] + "장");
			exEUR = exEUR % ConstValueClass.arrEur[i];
		}
	} 
	
	public void outputResultJPY(int amount) {
		int exJPY = (int)(amount / JPY_RATE) * 100;
		System.out.println("환전결과 : " + exJPY + "엔");
		int[] arrJPY = ConstValueClass.arrJPY;
		for (int i = 0; i < ConstValueClass.arrJPY.length; i++) {
			System.out.println(ConstValueClass.arrJPY[i] + "엔 : " 
			+ exJPY / ConstValueClass.arrJPY[i]);
			exJPY = exJPY % ConstValueClass.arrJPY[i];
		}
	}
	
	public void outputResultUSDtoWon(int amount) {
		int returnKor = (int)(amount % USD_RATE) / 10 * 10;
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
		    + returnKor / ConstValueClass.arrKOR[i] + "개");
			returnKor = returnKor % ConstValueClass.arrKOR[i];
		}
	}
	
	public void outputResultEURtoWon(int amount) {
		int returnKor = (int)(amount % EUR_RATE) / 10 * 10;
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
			+ returnKor / ConstValueClass.arrKOR[i] + "개");
			returnKor = returnKor % ConstValueClass.arrKOR[i];
		}
	}
	
	public void outputResultJPYtoWon(int amount) {
		int returnKOR = ((int)(amount % JPY_RATE) / 10 * 10);		
		System.out.println("거스름돈 : " + returnKOR + "원");			
		int [] arrKor = ConstValueClass.arrKOR;
		for (int i = 0; i < ConstValueClass.arrKOR.length; i++) {
			System.out.println(ConstValueClass.arrKOR[i] + "원 : " 
			+ returnKOR / ConstValueClass.arrKOR[i]);
			returnKOR = returnKOR % ConstValueClass.arrKOR[i];
		}	
	}
}
