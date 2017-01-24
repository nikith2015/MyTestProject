package practice;

public class SmallinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{4, 7, 9},
					{1, 2, 3},
					{6, 3, 8}
				
		};
		int mincol = 0;
		int small = a[0][0];
		for(int i =0;i<3;i++)
	{
			
			for(int j =0;j<3;j++)
		{
			
				if (a[i][j]<small )
				{
					small = a[i][j];
					mincol = j;
				}
							
			}
								
		}
		int max=a[0][mincol];
		int k = 0;
		while(k<3){
			
			if(a[k][mincol] > max){
				max = a[k][mincol];
			}
			k++;
		}
		
		
		System.out.println(small);
		System.out.println(max);
	}

}
