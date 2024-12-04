import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String str = sc.next();
		String org_str = str;
		String rev_str = "";
		
		int len = str.length();
		
		for(int i = len-1; i>=0; i--) {
			rev_str = rev_str+str.charAt(i);
		}
		
		if(rev_str.equals(org_str)) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
