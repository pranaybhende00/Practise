package programs.program;
public class MissingElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,5,6,7};
	int arraylLength=arr.length+1;
	int expectedSum=(arraylLength*(arraylLength+1))/2;
	int actualSum=0;
	
	for (int i = 0; i < arr.length; i++) {
		actualSum+=arr[i]; 
	}
	
	System.out.println("Mising element is "+ (expectedSum-actualSum));
}
}
