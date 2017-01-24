package practice;

public class ArraySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i[] = {13,21,23,24};
			int out[] = {0,0,0,0};
			for(int j=0;j<i.length;j++){
				
				out[j] = (i[j]*i[j]);
				System.out.println(out[j]);
			}
		
		
	}

}
