package Functions;

public class Atm {
	String bankname;
	String location;
	int mainbal;
	int depositeAmt;
	
	public String credit(int a,int b) {
		return "Credit amount is "+(a+b);
		
	}
	public String debit(int a,int b) {
		return "Debit amount is "+(a-b);
		
	}
	
	
	

}
