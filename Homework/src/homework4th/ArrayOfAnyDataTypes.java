package homework4th;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayOfAnyDataTypes {
	public static Object[] ArrayOfAnyDataTypes;

	ArrayOfAnyDataTypes(int n) {
		this.ArrayOfAnyDataTypes = new Object[n];
	}

	ArrayOfAnyDataTypes() {
		this.ArrayOfAnyDataTypes = new Object[10];
	}

	public Object[] add(Object o) {
		for (int i = 0; i < ArrayOfAnyDataTypes.length; i++) {
			if (ArrayOfAnyDataTypes[i] ==null){
				 ArrayOfAnyDataTypes[i] = o;
			}
		}
		return ArrayOfAnyDataTypes;
	}

	public String toString() {
		return Arrays.toString(ArrayOfAnyDataTypes);
	}

	public Object get(int index) {
		return ArrayOfAnyDataTypes[index];
	}

	public static void main(String[] args) {
		ArrayOfAnyDataTypes array = new ArrayOfAnyDataTypes();
		int a = 6;
		array.add(a);
		String b = "gdafgdfgs";
		array.add(b);
		Long l = 9856l;
		array.add(l);
		//System.out.println(array.toString());
		System.out.println(array.get(2));

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * List<Object> list = new ArrayList<Object>(); list.add(1);
	 * list.add("qwer"); list.add("qwer1"); list.add("qwer2");
	 * list.add("qwer3"); list.add("qwer4"); list.get(2);
	 * 
	 * for (int i = 0; i < list.size(); i++) { System.out.print(Task2.get(i,
	 * list) + " "); }
	 * 
	 * }
	 */

}
