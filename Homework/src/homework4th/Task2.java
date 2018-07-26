package homework4th;

import java.util.Arrays;

public class Task2 {
	public Object[] ArrayOfAnyDataTypes;

	Task2() {
		this.ArrayOfAnyDataTypes = new Object[10];
	}

	public Object[] add(Object o) {
		for (int i = 0; i < ArrayOfAnyDataTypes.length; i++) {
			if (ArrayOfAnyDataTypes[i] == null) {
				ArrayOfAnyDataTypes[i] = o;
				break;
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
		Task2 array = new Task2();
		int a = 6;
		array.add(a);
		String b = "gdafgdfgs";
		array.add(b);
		Long l = 9856l;
		array.add(l);
		System.out.println(array.toString());
		System.out.println(array.get(1));

	}

}
