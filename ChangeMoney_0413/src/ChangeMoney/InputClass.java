package ChangeMoney;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;

	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public int inputFromConsoleWon() {
		System.out.print("원화입력 : ");      
		int korWon = sc.nextInt();  
		return korWon;                                 
	}
	
	public int inputFromConsoleNumber() {		
		System.out.println("어떤 돈으로 환전하시겠습니까?\n"
				+ "1. USD\n"
				+ "2. EUR\n" 
				+ "3. JPY\n"
				+ "0. EXIT");
		int number = sc.nextInt();
		return number;
	}
}
