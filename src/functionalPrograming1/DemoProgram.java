package functionalPrograming1;

import java.util.List;

public class DemoProgram {

	public static void main(String[] args) {
		List<String> lists =List.of("man","bat","cat","dog");
		printWithFpFilter(lists);
	}
		public static void printbasic(List<String> lists) {
			for(String list:lists) {
				System.out.println(list);
				}
			
		}
		public static void printWithFp(List<String> lists) {
			lists.stream().forEach(element ->System.out.println(element));
			
			}
		public static void printWithFpFilter(List<String> lists) {
			lists.stream().filter(element ->element.endsWith("at")).forEach(element ->System.out.println(element));
			
			}
		
	}

