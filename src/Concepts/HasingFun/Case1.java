package Concepts.HasingFun;

//overriding both
import java.util.HashMap;
import java.util.Map;

class person {
	String name;
	int id;

	person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null || obj.getClass() != this.getClass())
			return false;
		person p = (person) obj;
		return (p.name.equals(this.name) && p.id == this.id);

	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class Case1 {

	public static void main(String[] args) {
		person g1 = new person("eshu", 101);
		person g2 = new person("amit", 102);

		Map<person, String> map = new HashMap<person, String>();
		map.put(g1, "p1");
		map.put(g2, "p2");

		for (person p : map.keySet()) {
			System.out.println(map.get(p).toString());
		}
	}
}