package in.co.rays.basic;

public class TestSwichCase {
	
public static void main(String[] args) {
	String day = "wednesday" ;
	switch ( day) {
	
	    case "monday" :
		System.out.println("1st day of the week");
			break;
			
	case "tuesday" :
		System.out.println("2nd day of the week");
		break;
		
	case "wednesday" :
		System.out.println("3 day of the week");
		break;
		
	case "thursday" :
		System.out.println("4 day of the week");
		break;

	case "firday" :
		System.out.println("5 day of the week");
		break;
		
	case "saturday" :
		System.out.println("6 day of the week");
		break;

		default:
			System.out.println("aaj chutti hai-----");
			break;
		}
		
	}
	
}

