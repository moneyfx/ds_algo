import java.util.*;

public class FirstRecurringCharInString {

	public static void main(String[] args) {
		String str = "AB";
		Character result = getFirstRecurringChar(str);

		System.out.println(result);
	}

	public static Character getFirstRecurringChar(String str) {
		Set<Character> set = new HashSet<Character>();
		char currentChar;
		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if (set.contains(currentChar)) {
				return currentChar;
			}
			set.add(currentChar);
		}

		return null;
	}
}