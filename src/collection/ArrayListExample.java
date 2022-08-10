package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String[] array1 = {"abc","pqr","xyz","asdasd","rtert"};
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Krisha");
		list1.add("Pratiksha");
		list1.add("Nayan");
		list1.add("Ankit");
		list1.add("Pragati");
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		list1.remove(1);
		
		System.out.println("List is this after removing Leeana " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		System.out.println("The data at 4th position is " + list1.get(3));
		
		list1.set(0, "Riya");
		System.out.println("List is this after replacing John " + list1);
		
		list1.add(1, "Pihuu");
		System.out.println("List is this after adding Leeana again " + list1);
		
		Collections.sort(list1);
		System.out.println("List is this after sort " + list1);
		
		
		for(int index=0;index<list1.size();index++) {
			
			System.out.println(list1.get(index));
		}
		
		for(String name:list1) {
			
			System.out.println(name);
			
		}
		
		for(int index=0;index<list1.size();index++) {
			if(list1.get(index).equals("Ankit")){
	            System.out.println(index);
	            break;
	        }
		}

	}

}
