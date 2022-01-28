package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char search ='c';
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(search==str.charAt(i))
				count++;
		}
		System.out.println("count of " + search + " is " + count);

	}

}
