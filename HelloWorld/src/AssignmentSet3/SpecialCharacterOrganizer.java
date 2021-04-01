package AssignmentSet3;


public class SpecialCharacterOrganizer {
	public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		String letters = "";
		String specials = "";
		String speicalCs = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		
		char[] characters = str.toCharArray();
		for(char c: characters)
			if(speicalCs.contains(Character.toString(c))) {
				specials+= Character.toString(c);
			}else {
				letters+= Character.toString(c);
			}
		String result = letters.concat(specials);

        return result;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
}
