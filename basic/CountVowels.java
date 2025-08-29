package in.co.rays.basic;

public class CountVowels {
	public static void main(String[] args) {
		String str = "ritesh patidar";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i)
					|| 'u' == str.charAt(i)) {
		count++;
	}

	}
		System.out.println("totoal vowels:" + count);
	}
}
