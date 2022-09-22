//Insertion sorting
public class arry13
{
	public static void main(String [] args)
	{
		int a[] = {1,4 ,5 ,7,8 ,3,2};
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i;
			for(; j>=0;j--)
			{
				if(temp<a[j-1])
				{
					a[j]=a[j-1];
				}
				else
				{
					break;
				}
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
