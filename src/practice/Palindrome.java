package practice;

import org.apache.xpath.operations.Equals;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String S = "JEEVANAANAVEEJ";
	
	String P = "";
	
	for (int i=S.length()-1;i>=0;i--){
		
		P = P + S.charAt(i);
		
	}
	
	System.out.println(P);
	if (S.equals(P)){
		System.out.println("String is Palyndrome");
	}
	

}
}