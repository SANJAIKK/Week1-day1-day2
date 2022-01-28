package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int input=5;
		int factorial=1;
		for(int i=1;i<=input;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		int j=5;
		while(j>=1)
		{
			System.out.print(j + "*");
			j--;
			
		}
		System.out.print(" =" + factorial);
		

	}
	

}
