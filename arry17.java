//Second max in array
public class arry17
{
	public static void  main(String [] args)
	{
		int a[]={12,23,3,8,7,9,13};
		
		int fm=0;
		int sm=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > fm)
			{
				sm = fm;
				fm = a[i];
			}
			if(a[i] > sm && a[i] != fm)
			{
				sm = a[i];
			}
		}
		System.out.println(sm);
	}
}