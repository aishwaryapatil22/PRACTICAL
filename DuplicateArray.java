package Array;

import java.util.Arrays;

public class DuplicateArray {
	
	    public static void main(String[] args) {
	    	
	    	int[] arr = {2, 3, 4, 5, 2, 4};
	    	// Find duplicates in the array
	        for (int i=0; i<arr.length-1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("The Duplicate Array is: " + arr[i]);


	    }
	}
}
	        }
	    }
	    