package in.co.rays.basic;

public class CountName { 
	
public static void main(String[] args) {
	
	String str = "ritesh patidar" ;
	
   int count = 0;
   for (char c= 'a'; c<'z'; c++) {
	for (int i = 0; i < str.length(); i++) {
   if ( c== str.charAt( i)) {
	count++;
		
		}
	}
	if ( count>0) {
	System.out.println(c+ "="+ count);	
	count=0;
	}
}

		
	}  
	
}

 
