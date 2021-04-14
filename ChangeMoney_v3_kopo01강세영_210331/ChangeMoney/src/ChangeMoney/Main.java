package ChangeMoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int korWon = 0;
		int number = 0;
		InputClass inputClass = new InputClass();
		
		while (true) {
			korWon = inputClass.inputFromConsoleWon();
			number = inputClass.inputFromConsoleNumber();
			
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