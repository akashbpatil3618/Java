public static arry4
{
	public static void main(String[] args)
	{
		int[] a={90,20,40,50,60};
		int[] b=new int[5];
		
		System.ou.println("before");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i =0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("after");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	}
	
}