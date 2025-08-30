package in.co.rays.basic;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date d = new Date( );
		System.out.println("---before formating---");
		System.out.println("Date :" + d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format (d);
		System.out.println("----after formating----");
		
		System.out.println("date:" + str);
		SimpleDateFormat sdf1 =new SimpleDateFormat ("H:mm");
		String str1 = sdf1.format (d);
		System.out.println("-----after formating-----");
			System.out.println(str1);
		
		
}
}