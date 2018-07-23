import java.util.Arrays;

public class SuperArray {
   
   public static Object [] SuperArray;
   SuperArray(int n){
      this.SuperArray = new Object[n];
   }
   
   SuperArray(){
      this.SuperArray = new Object[10];
   }
      
   public Object[] add(Object o){            // метод для добавления элементов любого типа в массив
      int count = -1;   
      if (SuperArray[SuperArray.length-1] != null){
         Object [] array = new Object [SuperArray.length+1];
         for(int i=0; i<SuperArray.length; i++){
            array = SuperArray;
         }
         SuperArray = array;
      }
      do{
         count++;
      }
      while (SuperArray[count]!=null);
      if(SuperArray[count] == null){
         SuperArray[count] = o;
      }
      return SuperArray;   
   }
   
      
   public String toString(){              //метод для преобразования массива в строку
      return Arrays.toString(SuperArray);
   }
   
   public Object get(int i){               //метод для получения данных любого типа
      return SuperArray;
   }
   
   
   
   
   public static void main(String[] args){
      SuperArray listarray = new SuperArray(1);
      int a = 1;
      listarray.add(a);
      String b = "12365";
      listarray.add(b);
      Long l = 1236654778899l;
      listarray.add(l);
      System.out.println(listarray.toString());
      System.out.println(listarray.get(2));
      
      
   }
   }
    