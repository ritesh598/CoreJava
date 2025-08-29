package in.co.rays.basic;

public class TestArray { 
	
public static void main(String[] args) {
		
  int	[ ] a = {5,10,15,20,25,30,35 };

  System.out.println(a[0] + "," + a[1] +"," +a[2] + "," + a[3] + "," + a[4] + "," + a[5]);
			 
  System.out.println("_______________");
	
  System.out.println("length: " +a.length);
	 
  for (int i= 0; i <a.length ; i++) {
	
  System.out.println(i + ". * " + a[i] );

		
	}
	
	}
	
}

