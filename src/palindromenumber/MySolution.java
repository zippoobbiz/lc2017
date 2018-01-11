package palindromenumber;

public class MySolution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else if (reverse(x) == x) {
			return true;
		} else {
			return false;
		}
	}

	public static int reverse(int x) {
		String s = x + "";
		String result = "";
		if (s.charAt(0) == '-') {
			s = s.substring(1);
			result += '-';
		}
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			result += c[i];
		}
		int answer = 0;
		try {
			answer = Integer.parseInt(result);
		} catch (Exception e) {

		}
		return answer;
	}
}
