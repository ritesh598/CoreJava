package in.co.rays.basic;

public class FindForeArray {
	
public static void main(String[] args) {
	
  int []  a= { 5,10, 15, 20, 25, };

  int n= 15;

  int position= -1;

  for (int i = 0; i < a.length; i++) {

  if ( n == a[i]) {
		
  position = i; 	

  System.out.println("position of 15is:" + position);
	}
}

  if ( position == -1) {
	
  System.out.println("position");
	
	
}

}
}
