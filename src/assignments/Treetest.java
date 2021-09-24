package assignments;

import java.util.Map;
import java.util.TreeMap;

public class Treetest {

	

	public static void main(String[] args) {
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		treeMap.put(3, "This shold come last");
		treeMap.put(2, "b");
		treeMap.put(1, "c");
		
		for(Integer items:treeMap.keySet()) {
			System.out.println(items + "" + treeMap.get(items));
		}

	}

}
