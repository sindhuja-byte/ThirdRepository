package Functions;

public class Bike {
	String brand;
	int price;
	String colour;
	int taxPercentage;
	
	
	public int netPrice(int a,int b) {
		
		int total=price+taxPercentage;
		return total;
	}

}
