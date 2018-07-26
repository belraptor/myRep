package homework4th;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		Random rand = new Random();		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			list1.add(rand.nextInt(10));
			list2.add(rand.nextInt(10));
		}
//		list1.add(1); list1.add(2);	list1.add(3); list1.add(4);	list1.add(5);
//		list2.add(1); list2.add(3);	list2.add(5); list2.add(7);

		printList(list1, "list1: ");
		printList(list2, "list2: ");
		union(list1, list2);
		intersect(list1, list2);

	}
	public static void printList(List<Integer> list, String name) {
		System.out.println("Print " + name +  list);
		
	
	}
	
	public static void intersect(List<Integer> list1, List<Integer> list2) {
		List<Integer> allInterList = new ArrayList<>();
		System.out.println("\nIntersect result:");
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					allInterList.add(list1.get(i));
				}
			}
		}
		List<Integer> intersectList = new ArrayList<>();
		for (int i:allInterList){
			if(!intersectList.contains(i))
				intersectList.add(i);
		}
		
		
		for (int i = 0; i < intersectList.size(); i++) {
			System.out.print(intersectList.get(i) + " ");
		}
	}

	public static void union(List<Integer> list1, List<Integer> list2) {
		List<Integer> unionList = new ArrayList<>();
		System.out.println("\nUnion result:");
		for (int i = 0; i < list1.size(); i++) {
			unionList.add(list1.get(i));
		}
		for (int j = 0; j < list2.size(); j++) {
			unionList.add(list2.get(j));
		}

		for (int i = 0; i < unionList.size(); i++) {
			System.out.print(unionList.get(i) + " ");
		}
	}

}
