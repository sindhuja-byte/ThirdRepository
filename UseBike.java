package Functions;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 =new Bike();
		
		b1.brand="R15";
		b1.price=100000;
		b1.colour="Black";
		b1.taxPercentage=5;
		
		System.out.println(b1.netPrice(b1.price , b1.taxPercentage));
		
		
	}

}
