package homework4th;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Task2 {
public static void main(String[] args) {
	
	List <Object> list = new ArrayList<Object>();
	list.add(1);
	list.add("qwer");
	list.get(5);
	
	for (int i=0; i<list.size(); i++){
		System.out.print(list.get(i));
	}
	
	
	
		
	}
	


private static Object get(int index, Task2 list) {
	return list.get(index, list);
	
}
}
