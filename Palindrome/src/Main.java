
public class Main {

	public static void main(String[] args) {
		String test = "racecar";
		if (isPalindromeRecursive(test)) {
			System.out.println(test + " is a palindrome");
		}
		else {
			System.out.println(test + " is not a palindrome");
		}
		test = "poop";
		if (isPalindromeRecursive(test)) {
			System.out.println(test + " is a palindrome");
		}
		else {
			System.out.println(test + " is not a palindrome");
		}
		test = "Bienve";
		if (isPalindromeRecursive(test)) {
			System.out.println(test + " is a palindrome");
		}
		else {
			System.out.println(test + " is not a palindrome");
		}
		
		test = "BB";
		if (isPalindromeRecursive(test)) {
			System.out.println(test + " is a palindrome");
		}
		else {
			System.out.println(test + " is not a palindrome");
		}	
		
	}


	public static boolean isPalindrome(String s) {
		int j = s.length()-1;
		for (int i=0;i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			j--;
			
		}
		return true;
	}

	public static boolean isPalindromeRecursive(String s) {
		if (s.length() <= 1) {
			return true;
		}
//		else if (s.length() == 2)  {
//			return (s.charAt(0)==s.charAt(1));
//		}
		else {
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				String shorter = s.substring(1, s.length()-1);
				return isPalindromeRecursive(shorter);
			}
			return false;
		}
	}
}
