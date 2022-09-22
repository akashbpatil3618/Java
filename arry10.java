//Leader Element.
public class arry10
{
	public static void main(String [] args)
	{
		int a[] = {9,14,288,11,20,120};
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					cnt++;
				}
					
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}