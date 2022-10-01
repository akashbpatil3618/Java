//Write a program to check whether a given string ends with the contents of another string.
public class endswith
{
	public static void main(String [] args)
	{
	String s1="You all are very good student";
	String s2="student";
	
	System.out.println(s1.endsWith(s2));
	System.out.println(MyOwnEndsWith(s1,s2));
	}
	private static boolean MyOwnEndsWith(String s1,String s2)
	{
	if(s2.length()>s1.length())
		return false;
	    
		int i=s1.length()-1;
		int j=s2.length()-1;
		
		while(j>=0)
		{
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(j);
			
			if(ch1==ch2)
			{
				i--;
				j--;
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}