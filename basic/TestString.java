package in.co.rays.basic;

public class TestString {
 
	public static void main(String[] args) {
		
	String name = "Ritesh Patidar";
	System.out.println("name :" + name);
	System.out.println(name.length());
	System.out.println(name .charAt( 8));
	System.out.println(name.indexOf("ati" ));
	System.out.println(name.indexOf( "s"));
	System.out.println(name.lastIndexOf("t" ));
	System.out.println(name.replace( "i" , "g"));
	System.out.println(name.replace("g" , "i" ));
	System.out.println(name.toLowerCase( ));
	System.out.println(name.toUpperCase( ));
	System.out.println(name.startsWith( "ritesh"));
	System.out.println(name.startsWith( "Ritesh"));
	System.out.println(name.endsWith( "idar"));
	System.out.println(name.substring( 4));
}
}
