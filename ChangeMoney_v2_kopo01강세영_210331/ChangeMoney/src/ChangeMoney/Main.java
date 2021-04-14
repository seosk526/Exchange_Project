package ChangeMoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
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
			
			RunExchange runClass = new RunExchange();
			if (number == ConstValueClass.CHANGE_USD) {
				runClass.printUSD(korWon);
			}
			else if (number == ConstValueClass.CHANGE_EUR) {
				runClass.printEUR(korWon);
			}
			else if (number == ConstValueClass.CHANGE_JPY) {
				runClass.printJPY(korWon);
			}
			if (number == ConstValueClass.EXIT) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}		
	}		
}