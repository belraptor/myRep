package homework2nd;

import java.util.StringTokenizer;

public class Task5 {
public static void main(String[] args) {
	String str = " int countTokens()  используя текущий набор разделителей, определяет количество лексем, которые осталось разобрать и возвратить в качестве результата";
	StringTokenizer st = new StringTokenizer(str, " ");
	
	System.out.println(st.countTokens());
}
}
