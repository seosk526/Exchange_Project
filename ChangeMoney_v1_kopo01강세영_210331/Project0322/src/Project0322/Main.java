package Project0322;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CHANGE_USD = 1;
		final int CHANGE_EUR = 2;
		final int CHANGE_JPY = 3;
		final int EXIT = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("원화입력 : ");
			int korWon = sc.nextInt();
			System.out.println("어떤 돈으로 환전하시겠습니까?\n"
								+ "1. USD\n"
								+ "2. EUR\n" 
								+ "3. JPY\n"
								+ "0. EXIT");
			int number = sc.nextInt();
			
			if (number == CHANGE_USD) {
				printUSD(korWon);
			}
			else if (number == CHANGE_EUR) {
				printEUR(korWon);
			}
			else if (number == CHANGE_JPY) {
				printJPY(korWon);
			}
			if (number == EXIT) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}		
	}
	
	public static void printUSD(int amount) {
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
	
	public static void printEUR(int amount) {
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
	
	public static void printJPY(int amount) {
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