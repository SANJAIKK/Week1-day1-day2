package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		String rev="madam";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		char ch='a';
		String add=rev+ch;
		System.out.println(add);
		if(str.equals(add))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}

}
