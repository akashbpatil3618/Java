//Write a program to compare two stringslexicographically.

public class compare
{
	public static void main(String [] args)
	{
		String s1="abcdp";
		String s2="abcdp";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(myCompateTo(s1,s2));
	
	}
	private static int myCompateTo(String s1,String s2)
	{
		for(int i=0;i<s1.length() && i<s2.length();i++)
		{
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1!=ch2)
				return ch1-ch2;
		}
		return s1.length()-s2.length();
	}
}	