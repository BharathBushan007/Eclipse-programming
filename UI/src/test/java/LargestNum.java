import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Second Number : ");
		int b = sc.nextInt();
		
		System.out.println("Third Number : ");
		int c = sc.nextInt();
		
		int largest =c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);
	}

}
