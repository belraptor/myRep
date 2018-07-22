package homework4th;

import java.util.Arrays;
import java.util.List;

public interface Task1FuncInt<T> {

	public default List <T> convert(T [] objectArray){
	 return Arrays.asList(objectArray);
	 
	}

}
