package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class p_0426 {
	
	public static void main(String[] args) {
		
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("age","19");
		testMap.put("name", "가유");
		testMap.put("드라마", "델루나");
		testMap.put("movie", "괴담");
		
		System.out.println(testMap.get("age"));
		
		Set<String> keyS = testMap.keySet();
		
		Set<Map.Entry<String, String>> mapSet = testMap.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, String> et = entryIt.next();
			System.out.print(et.getKey() + " ");
			System.out.println(et.getValue());
		}
	}

}
