package homework5th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Task1 {
public static void main(String[] args) {
	List<Integer> arrayList = new ArrayList<>();
	List<Integer> linkedList = new LinkedList<>();
	TreeSet<Integer> treeSet = new TreeSet<>();
	HashSet<Integer> hashSet = new HashSet<>();
	Map<String, Object> hashMap = new HashMap<String, Object>();
	
	Measure (arrayList, "ArrayList", hashMap);
	Measure (linkedList, "LinkedList", hashMap);
	Measure (treeSet, "TreeSet", hashMap);
	Measure (hashSet, "HashSet", hashMap);
	for (Map.Entry entry : hashMap.entrySet()) {
	    System.out.println(entry.getKey() + ", " + entry.getValue());
	}
}

public static void Measure(Collection<Integer> coll, String string, Map<String, Object> map){
	int i;
	long c = System.currentTimeMillis();	
	for (i=0; i< 10000;i++){
		coll.add(new Integer(i));
	}
	int cAdd = (int) (System.currentTimeMillis()-c);
	System.out.println("Collection '" + string + "'\nTime for ADD 10000 elements in collection is \t\t"+ cAdd + "ms.");
	map.put(string, new HashMap<Integer, Object>());
	Map<Integer, Object>inneredMap = (Map<Integer, Object>)map.get(string);
	inneredMap.put(cAdd, coll);
	c = System.currentTimeMillis();
	for (i=0; i< 10000;i++){
		coll.contains(new Integer(i));
	}
	System.out.println("Time for CONTAINS 10000 elements in collection is \t"+ (System.currentTimeMillis()-c) + "ms.");
	c = System.currentTimeMillis();
	for (i=0; i< 10000;i++){
		coll.remove(new Integer(i));
	}
	System.out.println("Time for REMOVE 10000 elements in collection is \t"+ (System.currentTimeMillis()-c) + "ms.\n");
}

}
