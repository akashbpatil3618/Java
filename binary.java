//16. Write a program to perform binary search.
public class binary
{
	public static void main(String [] args)
	{
	int a[] ={45,46,47,48,49,50,51,52};
	int ft=0;
	int lt=7;
	int mid=(ft+lt)/2;
	int ele==48;
	while(ft<=lt)
	{
		if(a[mid]==ele)
		{
		System.out.println("Element found at index: "+mid);
		break;
		}
		else if(ele<a[mid])
		{
			lt=mid-1;
			
		}
		else
		{
			ft=mid+1;
		}
		mid=(ft+lt)/2;
	
	}
	if(ft>lt)
	{
		System.out.println("Element not found!!!!");
	}
}
}