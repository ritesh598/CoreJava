package in.co.rays.basic;

public class CountDigitFromString1 {
public static void main(String[] args) {
	
	String str = "erl34wel3re45or4";
	int count= 0;
	for (int i = 0; i < str.length(); i++) {
		if ( Character.isDigit (str.charAt( i)) ){
			System.out.println(str.charAt( i));
			count++;
			
		}
	}
		System.out.println("totle digit is:" + count);
	
}
}
