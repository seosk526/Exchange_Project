package ChangeMoney;

public class RunExchange {
	public void printUSD(int amount) {
		int exUSD = (int)(amount / 1134.30);
		System.out.println("환전결과 : " + exUSD+ "달러");
		int [] arrUsd = {100, 50, 20, 10, 5, 1};
		for (int i = 0; i < arrUsd.length; i++) {
			System.out.println(arrUsd[i] + "달러 : " + exUSD / arrUsd[i] + "장");
			exUSD = exUSD % arrUsd[i];
		}
		int returnKor = (int)(amount % 1134.30);
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = {500, 100, 50, 10};
		for (int i = 0; i < arrKor.length; i++) {
			System.out.println(arrKor[i] + "원 : " + returnKor / arrKor[i] + "개");
			returnKor = returnKor % arrKor[i];
		}
	}		
	
	public void printEUR(int amount) {
		int exEUR = (int)(amount / 1332.92);
		System.out.println("환전결과 : " + exEUR + "유로");
		int [] arrEur = {200, 100, 50, 20, 10, 5};
		for (int i = 0; i < arrEur.length; i++) {
			System.out.println(arrEur[i] + "유로 : " + exEUR / arrEur[i] + "장");
			exEUR = exEUR % arrEur[i];
		}
		int returnKor = (int)(amount % 1332.92);
		System.out.println("거스름돈 : " + returnKor + "원");
		int [] arrKor = {500, 100, 50, 10};
		for (int i = 0; i < arrKor.length; i++) {
			System.out.println(arrKor[i] + "원 : " + returnKor / arrKor[i] + "개");
			returnKor = returnKor % arrKor[i];
		}
	}
	
	public void printJPY(int amount) {
		int exJPY = (int)(amount / 1029.16) * 100;
		System.out.println("환전결과 : " + exJPY + "엔");
		int[] arrJPY = {10000, 5000, 2000, 1000, 500, 100};
		for (int i = 0; i < arrJPY.length; i++) {
			System.out.println(arrJPY[i] + "엔 : " + exJPY / arrJPY[i]);
			exJPY = exJPY % arrJPY[i];
		}
		int returnKOR = ((int)(amount % 1029.16) / 10 * 10);		
		System.out.println("거스름돈 : " + returnKOR + "원");			
		int[] arrKOR = {500, 100, 50, 10};
		for (int i = 0; i < arrKOR.length; i++) {
			System.out.println(arrKOR[i] + "원 : " + returnKOR / arrKOR[i]);
			returnKOR = returnKOR % arrKOR[i];
		}	
	}

}
