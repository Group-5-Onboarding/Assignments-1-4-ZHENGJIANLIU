package demo;

public class testing {
	public static void main(String[] args) {
		int num =2;
		try {
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
		finally {
			num = 5;
			System.out.println(num);
			System.out.println("changed");
		}
	}
}
