public class convertchar
{
	public static void main(String [] args)
	{
		String s= "ABCDE";
		
		//A = 65 +32;
		
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			c = (char)(c+32);
			s1 = s1 + c;
		}
		System.out.println(s1);
	}
}