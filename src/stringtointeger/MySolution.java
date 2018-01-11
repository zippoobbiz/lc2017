package stringtointeger;

public class MySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("      -11919730356x"));
		// System.out.println(Integer.parseInt("-123"));

	}

	public static int myAtoi(String str) {
		int result = 0;
		String s = "";
		for (char c : str.trim().toCharArray()) {
			if (c != '-' && c != '+' && !Character.isDigit(c)) {
				break;
			}
			s += c;
			try {
				result = Integer.parseInt(s);
				if (result != 0) {
					s = result + "";
				}
			} catch (Exception e) {

			}
		}
		if (s.length() > 12) {
			s = s.substring(0, 12);
		}
		try {
			if (Long.parseLong(s) > 2147483647) {
				return 2147483647;
			} else if (Long.parseLong(s) < -2147483648) {
				return -2147483648;
			}
			result = Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}



}
