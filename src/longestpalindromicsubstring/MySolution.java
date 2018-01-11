package longestpalindromicsubstring;

public class MySolution {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("aba"));
	}

    public static String longestPalindrome(String s) {
        String result = "";
        char[] cArr = s.toCharArray();
        for (int i = 0 ; i < cArr.length; i++) {
            for (int j = 0; j <= i && j < cArr.length - i; j++) {
                if (cArr[i-j] != cArr[i+j]) {
                    if ((2 * j - 1) > result.length()) {
                        result = s.substring(i-j+1, i+j);
                    }
                    break;
                } else {
                	if ((2 * (j + 1) - 1) > result.length()) {
                        result = s.substring(i-j, i+j+1);
                    }
                }
            }
        }

        for (int i = 0 ; i < cArr.length; i++) {
            for (int j = 0; j <= i && j < cArr.length - i - 1; j++) {
                if (cArr[i-j] != cArr[i+j+1]) {
                    if ((2 * j) > result.length()) {
                        result = s.substring(i-j, i+j-1);
                    }
                    break;
                } else {
                	if ((2 * (j + 1)) > result.length()) {
                        result = s.substring(i-j, i+j+2);
                    }
                }
            }
        }
        return result;
    }
}
