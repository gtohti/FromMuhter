package Arrays_Q109_Q137;

import java.util.Arrays;

public class Q132 {
	 public static void main(String[] args) {
		    int [][] multiplicationTable = new int[10][10];
		    
		    //TODO: type your code below
		    for(int i=0;i<10;i++)
			      for(int z=0;z<10;z++)
			        multiplicationTable[i][z]=(i+1)*(z+1);
		    
		    //Do not modify below line it will be used to test your code. And 
		    //Can be used by you while developing your code
		    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		  }

}
