package ChangeMoney;

public class RunExchange {
	public OutputClass outClass = null;
	
	public RunExchange() {
		outClass = new OutputClass();
	}
	
	public void printUSD(int amount) {
		outClass.outputResultUSD(amount);
		outClass.outputResultUSDtoWon(amount);
	}		
	
	public void printEUR(int amount) {
		outClass.outputResultEUR(amount);
		outClass.outputResultEURtoWon(amount);		
	}
	
	public void printJPY(int amount) {
		outClass.outputResultJPY(amount);
		outClass.outputResultJPYtoWon(amount);
	}
}
