package AssignmentSet3;

public class Palindrome {
	public static boolean checkPalindrome(String str){
		String reversed = "";
	    char[] characters = str.toCharArray();
	    for(int i = characters.length-1; i >= 0; i--){
	        reversed+=characters[i];
	    }
	    if(reversed.equals(str)){
	        return true;
	    }
        return false;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
