package firstprj;

public class Printclass {
	int a, b, n;
	
	public Printclass(int a, int b, int n) { // 생성자는 public과 이름만 있어야 함, void 있으면 안됨
		this.a = a;
		this.b = b;
		this.n = n;
	}
	public void printInteger() {
		System.out.println(this.n);		
	}
	
	public void printAdd() {
		int sum;
		sum = this.a + this.b;
		System.out.println(sum);
	}
		
	 /*public void printInteger(int n) {
		System.out.println(n);
	}
	
	public static int printAdd(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println(sum);
		return sum;
		
	}
	public int printSub(int a, int b) {
		int sub;
		sub = a - b;
		return sub;
	}
	public int printMulti(int a, int b) {
		int multi;
		multi = a * b;
		return multi;
	}
	public int printDivi(int a, int b) {
		int divi;
		divi = a / b;
		return divi;
	} 
	public static int d; */
	
	

}
