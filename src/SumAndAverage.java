
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[100];
		int sum=0;
		int average =0;
		for(int i=0;i<100;i++){
			a[i]= i+1;
			sum = sum+a[i];
		}
		average = sum/100;
		System.out.println("The sum is "+sum);
		System.out.println("The average is"+average);
	}

}
