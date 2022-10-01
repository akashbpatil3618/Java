// 3.size 
import java.util.HashSet;
public class colle9
{
	public static void main(String []args)
	{
		HashSet<Integer> list=new HashSet<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int size=list.size();
		System.out.println(size);
		
		for(int data:list)
		{
		System.out.println(data);
		}
	}
}