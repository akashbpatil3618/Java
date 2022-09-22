//Selection sort
public class arry15
{
	public static void main(String [] args)
	{
		int a[]={1,4,6,2,8,9,7,3};
		
	for(int i=0;i<a.length;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	
	System.out.print(a[i]+" ");
	}
	}
}
