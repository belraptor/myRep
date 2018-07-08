package homework2;
import java.util.Random;

public class Task7 {
public static void main (String [] args){
	Random rand = new Random();
	int a = 5+rand.nextInt(10);
	int [][] mas = new int [a][a];
	//заполняем верхняю половину
	for (int i=0; i < mas.length/2+1; i++){
		for (int j=0; j < mas[i].length; j++){
			if(j<i | j > mas[i].length-i-1){
			mas[i][j]=0;}
			else mas[i][j]=1;			
		}	
	}
	//заполняем нижнюю половину
	for (int i=mas.length-1; i >= mas.length/2; i--){
		for (int j=0; j < mas[i].length; j++){
			if(j>i | j < mas[i].length-i-1){
			mas[i][j]=0;}
			else mas[i][j]=1;		
		}
		}
	//выводим массив
	for (int i=0; i < mas.length; i++){
		for (int j=0; j < mas[i].length; j++){
			System.out.print(mas[i][j] + " ");
		}System.out.println();
	}	
}
}
/* пояснение
 * 		j0	j1	j2	j3	j4
 * i0	1	1	1	1	1		для заполнения нулём должно быть j<i
 * i1	0	1	1	1	0		для заполнения нулём должно быть j<i или j>length-i-1
 * i2	0	0	1	0	0		для заполнения нулём должно быть j<i или j>length-i-1
 * i3	0	1	1	1	0		для заполнения нулём должно быть j>i или j<length-i-1
 * i4	1	1	1	1	1		для заполнения нулём должно быть j>i
 * 
 * 
 */
