package practice;

public class ArrayAsc {

	public static void main(String[] args) {
		
		int list[] ={ 1,5,3, 4,6,2};
		int n = 6, i,j;
		int temp;
	    for (i = 0; i < ( n - 1 ); i++) {
	      for (j = 0; j < n - i - 1; j++) {
	        if (list[j] <list[j+1]) 
	        {
	           temp = list[j];
	           list[j] = list[j+1];
	           list[j+1] = temp;
	        }
	      }
	    }

	    for (i = 0; i < n; i++) 
	        System.out.println(list[i]);
	}
}
