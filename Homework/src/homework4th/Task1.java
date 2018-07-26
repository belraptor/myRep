package homework4th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1{
public static String[] str= {"1","2","3","4","5","6","7","8","9","q","w","e","r","t"};
static List <String> strList = new ArrayList<String>() ;


public static void main(String[] args) {
	
	
//	public List <T> convert(T [] objectArray)
	
	strList = Arrays.asList(str);
	
	
	
	for (int i=0; i < strList.size(); i++){
		System.out.print(strList.get(i));
	}
	 
}


}


