package demo;

public class javaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,111,222};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%3 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
