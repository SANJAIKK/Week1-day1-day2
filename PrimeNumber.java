package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		
		for(int i=2;i<=input/2;i++) {
			
			int j = input%i;
			if(j==0) 
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(input + " is a not a prime number");
		}
		else
		{
			System.out.println(input + " is a prime number");
		}

	}

}
