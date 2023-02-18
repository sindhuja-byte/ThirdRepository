package Functions;

public class FindMaxlen {
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
		
		public String minimum (String[] x) {
			int min =x[0].length();
			String w =" ";
			for(int i=0; i<x.length; i++) {
				if(x[i].length()<=min) {
					min=x[i].length();
					w=x[i];
				}
			}
			return w;
			
		
	}

}
