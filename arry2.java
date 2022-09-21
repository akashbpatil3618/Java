public class arry2
{
	public static void main(String [] args)
	{
		int[] a= {90,20,40,60,50};
		int num=30;
		int foundIndex=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == num)
			{
				
				foundIndex=i;
				break;
			}
			
		}
		if(foundIndex==-1)
				System.out.println("not found");
			else
				System.out.println("Found at index "+foundIndex);

	}
}