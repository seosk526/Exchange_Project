package ChangeMoney;

public class ConstValueClass {
	public static final int CHANGE_USD = 1;
	public static final int CHANGE_EUR = 2;
	public static final int CHANGE_JPY = 3;
	public static final int EXIT = 0;	

	public static final int [] arrUsd = {100, 50, 20, 10, 5, 1};
	public static final int [] arrEur = {200, 100, 50, 20, 10, 5};
	public static final int [] arrJPY = {10000, 5000, 2000, 1000, 500, 100};
	public static final int [] arrKOR = {500, 100, 50, 10};
	
	public static double BALANCE_USD = 500;
	public static double BALANCE_EUR = 500;
	public static double BALANCE_JPY = 50000;
	
	public static final int ERR_BALANCE_USD = 1;
	public static final int ERR_BALANCE_EUR = 2;
	public static final int ERR_BALANCE_JPY = 3;
	
	public static final double USD_RATE = 1134.30;
	public static final double EUR_RATE = 1332.92;
	public static final double JPY_RATE = 1029.16;
}
