package homework2nd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	in.close();
	//String str = "   s;d:a-s,;.:.,, ds(a!d?f)df,.fd.,fd,fd.ae,fr.";
	//String patternString = "(\\W)";
	Pattern punctuation = Pattern.compile("\\W");
	Matcher matcherPunctuation = punctuation.matcher(str);
	int sumPunctuation = 0;
	while (matcherPunctuation.find()){
		sumPunctuation++;		
	}
	Pattern space = Pattern.compile("\\s");
	Matcher matcherSpace = space.matcher(str);
	int sumSpace = 0;
	while (matcherSpace.find()){
		sumSpace++;		
	}
	System.out.println("Количество знаков препинания в тексте: " + (sumPunctuation-sumSpace));

		
	int before = str.length();
    int dot = str.replaceAll("[.]", "").length();
    int comma = str.replaceAll("[,]", "").length();
    int hyphen = str.replaceAll("[-]", "").length();
    int exclamationMark = str.replaceAll("[!]", "").length();
    int questionMark = str.replaceAll("[?]", "").length();
    int straightBracket = str.replaceAll("[(]", "").length();
    int backwardBracket = str.replaceAll("[)]", "").length();
    int semicolon = str.replaceAll("[;]", "").length();
    int colon = str.replaceAll("[:]", "").length();
    System.out.println("Количество знаков '.' в тексте: " + (before - dot) + "\nКоличество знаков ',' в тексте: " + (before - comma)
    		+ "\nКоличество знаков '-' в тексте: " + (before - hyphen) + "\nКоличество знаков '!' в тексте: " + (before - exclamationMark)
    + "\nКоличество знаков '?' в тексте: " + (before - questionMark) + "\nКоличество знаков '(' в тексте: " + (before - straightBracket)
    + "\nКоличество знаков ')' в тексте: " + (before - backwardBracket) + "\nКоличество знаков ':' в тексте: " + (before - semicolon)
    + "\nКоличество знаков ':' в тексте: " + (before - colon));
    
}
}
