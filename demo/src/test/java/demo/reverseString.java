package demo;

public class reverseString {

	public static void main(String[] args) {
		String s = "Madam";
		for(int i=s.length()-1;i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
