package Arrays_Q109_Q137;

import java.util.*;

public class Q128 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
			
			int[] arr=new int[size*2];
			arr[arr.length-1]=nums[nums.length-1];
			
			System.out.println(Arrays.toString(arr));
			
			
	  }

}
