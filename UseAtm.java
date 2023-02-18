package Functions;

public class UseAtm {
	public static void main (String[] args) {
	Atm atm1 = new Atm();
	atm1.bankname="STATEBANK";
	atm1.location="CHENNAI";
	atm1.mainbal =3000;
	atm1.depositeAmt=2000;
	System.out.println(atm1.credit(atm1.mainbal, atm1.depositeAmt));
	System.out.println(atm1.debit(atm1.mainbal, atm1.depositeAmt));
		
		
	
	Atm atm2 = new Atm();
	atm2.bankname="IOB";
	atm2.location="CHENNAI";
	atm2.mainbal =10000;
	atm2.depositeAmt=2000;
	System.out.println(atm1.credit(atm2.mainbal, atm2.depositeAmt));
	System.out.println(atm1.debit(atm2.mainbal, atm2.depositeAmt));
	
	}
}
