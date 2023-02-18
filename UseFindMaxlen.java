package Functions;

public class UseFindMaxlen {
	public static void main (String[] args) {
		FindMaxlen y =new FindMaxlen();
		String[] a= {"SINDHUJA","HASHINI","HARINI"};
		
		System.out.println(y.findMaxlen(a));
		System.out.println(y.minimum(a));
						
		}		
}	


 class Slength {
	public String findMaxlen (String[] x) {
		int max =x[0].length();
		String w =" ";
	for(int i=0; i<x.length; i++) {
		if(x[i].length()>=max) {
			max=x[i].length();
				w=x[i];
			}
		}
		return w;
	}	
public String minimum (String[] y) {
			int min =y[0].length();
			String w =" ";
			for(int i=0; i<y.length; i++) {
				if(y[i].length()<=min) {
					min=y[i].length();
					w=y[i];
				}
			}
			return w;					
	}


