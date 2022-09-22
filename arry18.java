/*
Remove the elements of 2nd array from 1st array(if found multiple,remove only two) 
Ex:input array int[]a= {1,1,1,1,1,2,2,3,4};elements to remove int[]n={1,2,4};expected output:{1,1,1,3} 
*/
public class arry18
{
	public static void main(String [] args)
	
	{
		int []a={1,1,1,1,1,2,2,3,4};
		int []b={1,2,4};
		
		for(int i=0;i<b.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					cnt++;
				}
				if(cnt==2)
				{
					break;
					
				}
			}
				int []c = new int[a.length-cnt];
				int index=0;
				int count=0;
				for(int k=0;k<a.length;k++)
				{
					if(b[i]==a[k] && count<2)
					{
						count++;
					}
					else
					{
						c[index++] = a[k];
					}
				}
				a = c;
		}
		
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		
	}
}