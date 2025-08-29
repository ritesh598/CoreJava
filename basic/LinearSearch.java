package in.co.rays.basic;

public class LinearSearch {

	public static void main(String[] args) {
		
		String [] fruits = {"Mango" , "Apple", "Orange", "banana",};
		linearsearch (fruits);
		
}
	public static void linearsearch(String[] fruits) {
		String s = "banana" ;
		int position = -1;
		for (int i = 0; i < fruits.length; i++) {
			if ( s== fruits  [i]) {
				position = i;
				System.out.println(s+ "=" + position);
				
	
			}
			
		}
//if ( position == -1) {
//	
//	System.out.println(position);
//}				
	}
			
	}
	


	
		
		
	
		
		
		
		
		