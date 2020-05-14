package functionalPrograming1;

import java.util.List;

public class FPRunnner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5,7,11,13,15,2);
		//number.stream().forEach(element -> System.out.println(element));
		int sum= numbers.stream().reduce(0, (number1, number2) -> number1+number2);
	System.out.println(sum);
/*	int sum =0;
	sum = normalSum(numbers, sum);
	System.out.println(sum);
	}

	private static int normalSum(List<Integer> numbers, int sum) {
		for (int number:numbers) {
			sum =sum+number;
				}
		return sum;*/
	}
}
