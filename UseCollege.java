package Functions;

public class UseCollege {
	public static void main (String[] args) {
		College c1 =new College();
		c1.name="SRV";
		c1.location="CHENNAI";
		c1.fees=100000;
		c1.grade='E';
		
		College c2 =new College();
		c2.name="SRM";
		c2.location="THENI";
		c2.fees=300000;
		c2.grade='A';
		
		College c3 =new College();
		c3.name="SSS";
		c3.location="MADURAI";
		c3.fees=200000;
		c3.grade='O';
		
		College[] clgs= {c1,c2,c3};
		System.out.println(c1.finfMaxFees(clgs));
		
		
		
		
		
		
	}

}
