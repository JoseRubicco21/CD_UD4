package ud4.e3;

import java.util.Arrays;

// Java program for implementation 
// of Bubble Sort 
public class BubbleSort { 
	
	
	public static void Sort(int arr[]) {
		// n = arr.length so we ensure that it goes once throug every item.
		int tmp;
		boolean hasSwapped;
		// This will loop over every item of arr.
		for(int i = 0; i < arr.length; i++) {
			// This will loop for the length of arr,length - 1 - i;
			// Suppose arr.length = 5; it will loop 5-1-0=4 & j=0 the first time;
			// 5-1-1=3, J=1; 
			// 5-1-2=2, J=2;
			// 5-1-3=1; J=3; -- This doesn't execute. They meet midway so it only checks for 1/2 of the
			// array, anything else after that won't execute.
			hasSwapped = false;
			// The arr.lenth - 1  - i  comes from the fact that bubble sort sends the biggest number to
			// the end of the array, such behaviour let's you not check the full length of array.
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					printArraySwap(arr[j], arr[j+1]);
					// Classical swap between 2 values of an array.
					// if current number is greater than next, we store the current one in tmp.
					hasSwapped = true;
					tmp = arr[j];
					// We then set current item to the value of next, having j+1 and j be equals.
					arr[j] = arr[j+1] ;
					// To displace we set j+1 to tmp which we stored before and determined it was bigger.
					arr[j+1] = tmp;
					// This won't throw an index out of bounds exception since J will never be greater
					// than arr.length;
					// hasSwapped will be true as long as we execute this code.
				};
			}
			
			printArrayState(arr);
			
			if(hasSwapped==false) {
				break;
			}
			}
		}
	
	public static void printArrayState(int[] arr) {
		System.out.println("Estado del array: " + Arrays.toString(arr));
	}
	
	public static void printArraySwap(int ... nums) {
		System.out.printf("Intercambiando %d por %d%n" , nums[0], nums[1]);
	}
	
	/*
	public void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i <= n; i++) 
			for (int j = 0; j <= n - j - 1; j++) 
				if (arr[j] > arr[j + 1]) { 
					// swap temp and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
				} 
	} 
	 */
	
	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		BubbleSort.Sort(arr); 
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
	} 
}
