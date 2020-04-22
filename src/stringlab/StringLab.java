package stringlab;
import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a;
		String b;
		String phrase;
		
		//String cap = StringMethods.capitalize("hi"); //test
		
		//capitalize
		System.out.print("Enter a word: ");
		a = scan.nextLine();
		System.out.println("\nCapitalized and formatted: "
							+ StringMethods.capitalize(a));
		
		//wheresWaldo
		System.out.println("\nIndex of \"Waldo\" in the \nphrase, \"Where is Waldo?\": " + 
							StringMethods.wheresWaldo("Where is Waldo?")); //test
		
		//firstThingsFirst
		System.out.print("\nEnter another word: ");
		b = scan.nextLine();
		System.out.print("\nCorrect word order: " + StringMethods.firstThingsFirst(a, b));
		
		//reverse
		System.out.println("\n\nFirst word reversed: " + StringMethods.reverse(a));
		
		//soLong
		System.out.print("\nThe longer word: ");
		StringMethods.soLong(a, b);
		
		//afterMath
		System.out.print("\n\nGive a phrase, preferably\nwith the word \"math\" in it: ");
		phrase = scan.nextLine();
		System.out.println("\nResult: " + StringMethods.afterMath(phrase));
		
		//letterize
		System.out.print("\nSecond word letterized:\n");
		StringMethods.letterize(b);
		
		//camelCase
		System.out.print("\nPhrase in camel case: " + StringMethods.camelCase(phrase));
		
		scan.close();
	}
}
