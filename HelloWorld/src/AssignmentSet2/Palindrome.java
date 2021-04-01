package AssignmentSet2;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.next();
		String reversedWord = "";
		int wordLength = word.length();
		
		for(int count = wordLength-1; count >= 0; count--) {
			reversedWord += word.toCharArray()[count];
		}
		if(word.equals(reversedWord)) {
			System.out.println(word + " " + "is a palindrome");
		}else{
			System.out.println(word + " " + "is not a palindrome");
		}
	}
}
