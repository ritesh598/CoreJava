package in.co.rays.basic;

public class StringAndStrinhBuffer {
public static void main(String[] args) {
	String s= "RITESH" ;
	s.toUpperCase(); //immutable
	System.out.println(s);
	System.out.println("--------------" );
	StringBuffer sb = new StringBuffer("PATIDAR");
	System.out.println(sb);
	sb.append ( " "+"PATIDAR");
	System.out.println(sb);
}
}
