package programs.program;
import java.util.*;
public class MaxSubArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,-5,4,-2,1};
	int maxValue=maxValue(arr);
	
}
public static int maxValue(int[] arr) {
	int max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
}
