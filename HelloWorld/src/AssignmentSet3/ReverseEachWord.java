package AssignmentSet3;

public class ReverseEachWord {
	public static String reverseEachWord(String str){
		String result = "";
	    for(String w: str.split(" ")) {
	    	char[] wArray = w.toCharArray();
	    	for(int i= wArray.length-1;i>=0;i--) {
	    		result+=wArray[i];
	    	}
	    }
        return result;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
