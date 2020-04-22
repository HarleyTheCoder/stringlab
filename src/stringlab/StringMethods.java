package stringlab;
import java.util.Scanner;

public class StringMethods {

	public static String capitalize(String word) {
		String result = word.substring(0, 1).toUpperCase() + 
				word.substring(1).toLowerCase();
		return result;
	}
	
	public static int wheresWaldo(String phrase) {
		int phraseIndex = phrase.indexOf("Waldo");
		return phraseIndex;
	}
	
	public static String firstThingsFirst(String a, String b) {
		String result = "";
		int i = 0;
		boolean solved = false;
		
		while (!solved) {
			if (i >= a.length() || i >= b.length()) {
				if (a.length() == b.length()) {
					result = a + " and " + b + " are alphabetically the same.";
					solved = true;
				} else if (a.length() < b.length()) {
					result = a + " and " + b;
					solved = true;
				} else {
					result = b + " and " + a;
					solved = true;
				}
			} else if (a.substring(i, i + 1).equalsIgnoreCase(b.substring(i, i + 1))) {
				solved = false;
				i++;
			} else if (a.toLowerCase().charAt(i) < b.toLowerCase().charAt(i)) {
				result = a + " and " + b;
				solved = true;
			} else {
				result = b + " and " + a;
				solved = true;
			}
		}
		return result;
	}
	
	public static String reverse(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i ==s.length() - 1) {
				result += s.substring(i);
			} else if (i == 0) {
				result += s.substring(i, 1);
			} else {
				result += s.substring(i, i + 1);
			}
		}
		return result;
	}
	
	public static void soLong(String a, String b) {
		if (a.length() == b.length()) {
			System.out.print(a + " is the same length as " + b);
		} else if (a.length() > b.length()) {
			System.out.print(a);
		} else if (b.length() > a.length()) {
			System.out.print(b);
		} else {
			System.out.print("error");
		}
	}
	
	public static String afterMath(String phrase) {
		int index;
		String tempPhrase = phrase.toLowerCase();
		
		if (tempPhrase.contains("math")) {
			index = tempPhrase.indexOf("math");
			return phrase.substring(index);
		} else {
			return "dud";
		}
	}
	
	public static void letterize(String word) {
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static String camelCase(String phrase) {
		Scanner scan = new Scanner(phrase);
		
		StringBuffer newPhrase = new StringBuffer("");
		String nxtWord;
		boolean keepGoing = true;
		
		nxtWord = scan.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		newPhrase.append(nxtWord);
		
		while(keepGoing) {
			if (scan.hasNext()) {
				nxtWord = scan.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
				newPhrase.append(nxtWord.substring(0, 1).toUpperCase() + 
						nxtWord.substring(1).toLowerCase());
			} else {
				keepGoing = false;
			}
		}
		scan.close();
		return newPhrase.toString();
		
	}


}
