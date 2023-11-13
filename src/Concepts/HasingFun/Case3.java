package Concepts.HasingFun;
//onlyhashcode
import java.util.HashMap;
import java.util.Map;

class person2{
	String name;
	int id;
	
	person2(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
}
public class Case3 {

	public static void main(String[] args) {
		person2 g1=new person2("eshu",101);
		person2 g2=new person2("amit",102);
		
		Map<person2, String> map=new HashMap<person2, String>();
		map.put(g1, "p1");
		map.put(g2, "p2");
		
		for(person2 p:map.keySet())
		{
			System.out.println(map.get(p).toString());
		}
	}
}