package practice;

//import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Random rn = new Random();
		
		int maximum = 10;
		int minimum = 0;
				
		int n = maximum - minimum + 1;
		int i = rn.nextInt() % n;
		int randomNum =  minimum + i;
		System.out.println(randomNum);
	}
	 */
	
		int random = (int )(Math.random() * 50 + 1);
		System.out.println(random);
	}
}
