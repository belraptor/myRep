package homework5th;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) throws IOException {
		String text = "Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key. (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time. ";
		final int length = (int) text.length();
		if (length != 0) {
			text = text.trim();
			text = text.toLowerCase();
			text = text.replaceAll("\\W", " ");
			Map<String, Integer> map = new HashMap<>();
			for (String s : text.split(" ")) {
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}
			map.remove("");
			System.out.println(map);
		}
	}
}
