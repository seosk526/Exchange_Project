package ChangeMoney;

import java.io.FileWriter;
import java.io.IOException;

public class RunExchange {
	
	private OutputClass outClass = null;
		
	public RunExchange() {		
		outClass = new OutputClass();
	}
	
	public void printUSD(int amount) throws Exception {
		outClass.outputResultUSD(amount);
	}		
	
	public void printEUR(int amount) throws Exception {
		outClass.outputResultEUR(amount);
	}
	
	public void printJPY(int amount) throws Exception {
		outClass.outputResultJPY(amount);
	}
}
