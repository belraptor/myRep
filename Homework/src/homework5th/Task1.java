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
//	Map<String, Integer, Collection> hashMap = new HashMap<String, Integer, Collection>;
	Measure (arrayList, "ArrayList");
	Measure (linkedList, "LinkedList");
	Measure (treeSet, "TreeSet");
	Measure (hashSet, "HashSet");
}

public static void Measure(Collection<Integer> coll, String string){
	int i;
	long c = System.currentTimeMillis();
	for (i=0; i< 10000;i++){
		coll.add(new Integer(i));
	}
	System.out.println("Time for add 10000 elements in '" + string + "' collection is "+ (System.currentTimeMillis()-c) + "ms.");
	c = System.currentTimeMillis();
	for (i=0; i< 10000;i++){
		coll.contains(new Integer(i));
	}
	System.out.println("Time for contains 10000 elements in '" + string + "' collection is "+ (System.currentTimeMillis()-c) + "ms.");
	c = System.currentTimeMillis();
	for (i=0; i< 10000;i++){
		coll.remove(new Integer(i));
	}
	System.out.println("Time for remove 10000 elements in '" + string + "' collection is "+ (System.currentTimeMillis()-c) + "ms.\n");
}

}
