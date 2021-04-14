package ChangeMoney;

public class RunExchange {
	private OutputClass outClass = null;
		
	public RunExchange() {
		outClass = new OutputClass();
	}
	
	public void printUSD(int amount) {	
		outClass.outputResultUSD(amount);
	}		
	
	public void printEUR(int amount) {
		outClass.outputResultEUR(amount);
	}
	
	public void printJPY(int amount) {
		outClass.outputResultJPY(amount);
	}
}
