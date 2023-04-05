package Concepts.HasingFun;
//ovridding equlas
import java.io.*;
import java.util.*;

class person1{
	String name;
	int id;
	
	person1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null||obj.getClass()!=this.getClass())
			return false;
		person1 p=(person1)obj;
		return (p.name.equals(this.name)&&p.id==this.id);
		
	}
	
}
public class Case2 {

	public static void main(String[] args) {
		person1 g1=new person1("eshu",101);
		person1 g2=new person1("amit",102);
		
		Map<person1, String> map=new HashMap<person1, String>();
		map.put(g1, "p1");
		map.put(g2, "p2");
		
		for(person1 p:map.keySet())
		{
			System.out.println(map.get(p).toString());
		}
	}
}