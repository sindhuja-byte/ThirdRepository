package Functions;

public class Classname {
	public void displayMarks(int tam,int eng,int mat,int sci,int soc) {
		
		System.out.println("TAMIL="+tam+"ENGLISH="+eng+"MATHS="+mat+"SCIENCE="+sci+"SOCIAL="+soc );
	}

	public void totalMarks(int tam,int eng,int mat,int sci,int soc) {
		  int total=tam+eng+mat+sci+soc;
		System.out.println(total);
	}
		
		public void average(int tam,int eng,int mat,int sci,int soc) {
			int add =tam+eng+mat+sci+soc;
			int average=add/5;
		
		System.out.println(average);
		}
		
		
		
		
		
		
	}


