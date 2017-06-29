package longestnonerepeatsubstring;

public class MySolution {

	public static void main(String[] args) {

		MySolution ms = new MySolution();
		System.out.println(ms.lengthOfLongestSubstring("abcbdccd"));
	}

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		String subStr = "";
		for (Character c: s.toCharArray()) {
			if (subStr.indexOf(c) < 0) {
				subStr += c;
			} else {				
				if (max < subStr.length()) {
					max = subStr.length();
				}
				subStr = (subStr + c).substring(subStr.indexOf(c) + 1);
			}
		}
		return max < subStr.length() ? subStr.length() : max;
	}
}
