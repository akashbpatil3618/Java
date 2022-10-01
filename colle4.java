// add element using iterator 
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class colle4
{
	public static void main(String []args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
