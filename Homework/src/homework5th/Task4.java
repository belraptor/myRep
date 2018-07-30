package homework5th;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task4 {
public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	MyService ms1 = new MyService("headLamp", "LED", 5);	
//	if(ms1.getClass().isAnnotationPresent(Version.class)){
//		Method [] ms1Method = MyService.class.getDeclaredMethods();
//		for (Method m: ms1Method) {
//            m.setAccessible(true);
//            m.invoke(ms1);
//		}
//	}else System.out.println("1");
	System.out.println(ms1.thisClassInfo());
}
}
