package programs.program;
public class SearchRotateArray 
{
public static void main(String[] args) 
{
	int arr[]= {4,5,6,7,0,1,2};
	int target=7;
	int store = 0;
	for (int i = 0; i < arr.length; i++) 
	{
		if (arr[i]==target) 
		{
			store=i;
			break;
		}
		else 
		{
			store=-1;
		}
	}
	System.out.println(store);	
}
}
