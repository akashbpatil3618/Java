//5. Write a program to test the equality of two arrays.(Variations)

public class arry5
{
	public static void main(String [] args)
	{
		int [] a={1,2,4,4,2,1};
		int [] b={1,3,4,4,2,1};
		if(a.length==b.length)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				continue;
				else
				{
					System.out.println("not same by element");
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("same by ele and length");
		}
		else
		{
			System.out.println("not same by length");
			
		}
	}
}