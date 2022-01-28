package week1.day2;

public class FibannociSeriess {

	public static void main(String[] args) {
		
		int range=8;
		int firstNum=0;
		int secNum=1;
		int thirdNum;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=1; i<=range; i++) {
			thirdNum = firstNum+secNum;
			firstNum = secNum;
			secNum = thirdNum;
			System.out.println(thirdNum);
		}
		
		
		

	}

}
