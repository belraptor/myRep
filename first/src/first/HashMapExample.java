package first;

import java.util.HashMap;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(1, "q");
	hm.put(2, "q");
	hm.put(3, "q");
	hm.put(4, "q");
	System.out.println(hm.size());
	System.out.println(hm.values());
}
}
