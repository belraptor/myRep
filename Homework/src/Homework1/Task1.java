package Homework1;

public class Task1 {
public static void main(String[] args) {
	int sec = 4500;
	/*
	 * 1 weak - 7day == 7*24 hours == 7*24*60 min == 7*24*60*60 sec
	 * 1 day - 24 hours == 24*60 min = 24*60*60 sec
	 * 1 hour - 60 min == 60*60 sec
	 * 1 min - 60 sec
	 */
		
	System.out.println(sec + " seconds is: " + sec/60 +" full minutes " + sec%60 + " seconds.");
	System.out.println("OR");
	System.out.println(sec + " seconds is: " + sec/(60*60) + " full hours " + sec%(60*60)/60 +" full minutes " + sec%60 + " seconds. ");
	System.out.println("OR");
	System.out.println(sec + " seconds is: " + sec/(24*60*60) + " full day " + sec%(24*60*60)/(60*60) + " full hours " + sec%(60*60)/60 
			+" full minutes " + sec%60 + " seconds. ");
	System.out.println("OR");
	System.out.println(sec + " seconds is: " + sec/(7*24*60*60) + " full weak " + sec%(7*24*60*60)/(24*60*60) + " full day " 
			+sec%(24*60*60)/(60*60) + " full hours " + sec%(60*60)/60 +" full minutes " + sec%60 + " seconds. ");
	
	
}
}
