package JavaPrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Values before swapping are: " + a + "  " + b);

		/*
		 * int t=a; a=b; b=t;
		 * 
		 * a=a+b;//=30 b=a-b; //10 a=a-b; //20
		 */
		
		a=a*b;   //200
		b=a/b;   //10
		a=a/b;   //20
		
		System.out.println("Values after swapping are: " + a + "  " + b);

	}

}
