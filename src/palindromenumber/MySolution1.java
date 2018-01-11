package palindromenumber;

public class MySolution1 {


	public static void main (String [] args) {
		System.out.println(isPalindrome(1001));
	}
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = 10 * reverse + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse / 10;
    }
}
