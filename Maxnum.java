package Functions;

public class Maxnum {
	public int findmax(int[] a) {
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>=max) {
				max=a[i];
				
			}
		}
		return max;      				
	}
	
	
	public void findmin(int[]b) {
		
		int min=b[0];
		for(int i=0; i<b.length; i++) {
			if(b[i]<=min) {
				min=b[i];
				
			}
		}
		System.out.println(min);
		
	}
	
}

  
