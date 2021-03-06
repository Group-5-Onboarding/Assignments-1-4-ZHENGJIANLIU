package AssignmentSet3;

public class FindTwoNumbers {
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[11];		
			int count = 0;
			for(int i = num1; i<=num2;i++) {
				int sum = 0;
				if(i > 0) {
					String str = Integer.toString(i);
					int number1 = Character.getNumericValue(str.charAt(0));
					int number2 = Character.getNumericValue(str.charAt(1));
					sum = number1+number2;
					if(sum%3==0 || sum%5==0 ) {
						numbers[count] = i;
						count++;
					}
				}
			}
			
			return numbers;
		}

		public static void main(String[] args) {
			int num1 = 10;
			int num2 = 30;

			int[] numbers = findNumbers(num1, num2);
			if (numbers[0] == 0) {
				System.out.println("There is no such number!");
			} else {
				for (int index = 0; index <= numbers.length - 1; index++) {
					if (numbers[index] == 0) {
						break;
					}
					System.out.println(numbers[index]);
				}
			}

		}
}
