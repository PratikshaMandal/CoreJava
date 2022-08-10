package collection;

import java.util.HashMap;

public class HashMApExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		
		map1.put(1, "Krisha");
		map1.put(2, "Pratiksha");
		map1.put(3, "Riya");
		map1.put(4, "Nayan");
		map1.put(5, "Pragati");
		map1.put(2, "Pihuu");
		map1.put(100, "Krishi");
	
		System.out.println(map1);
		
		System.out.println("Data at 4th key is " + map1.get(4));
		System.out.println("Data at 100th key is " + map1.get(100));
		
		map1.remove(100);
		System.out.println(map1);
		
		for (Integer key: map1.keySet() ) {
			
			System.out.println("Key is : " +  key);
			System.out.println("Value is : " + map1.get(key));
			
		}
		
		


	}

}
