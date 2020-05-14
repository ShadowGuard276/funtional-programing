package functionalPrograming1;

import java.util.List;

public class FPRunnner {
	public static void main(String[] args) {
		List<Integer> number = List.of(5,7,11,13,15,2);
		number.stream().forEach(element -> System.out.println(element));
		
	}
}
