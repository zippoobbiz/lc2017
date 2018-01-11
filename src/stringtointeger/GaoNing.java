package stringtointeger;

public class GaoNing {

	public int myAtoi(String str) {
		long anwser = 0;
		boolean F = false, sgn = false;
		if (str.length() != 0) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '.') {
					break;
				}

				if ((anwser == 0) && (str.charAt(i) == ' ')) {
					if (sgn) {
						break;
					}
				} else if ((anwser == 0) && ((str.charAt(i) == '+') || (str.charAt(i) == '-'))) {
					if (sgn) {
						break;
					}
					sgn = true;

					if (str.charAt(i) == '-') {
						F = true;
					}
				} else if ((str.charAt(i) > '9') || (str.charAt(i) < '0')) {
					break;
				} else {
					anwser = anwser * 10 + (str.charAt(i) - 0x30);

					if ((F) && (anwser > Integer.MAX_VALUE)) {
						return Integer.MIN_VALUE;
					} else if (anwser > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
				}
			}

			if (F) {
				anwser = 0 - anwser;
			}
		}
		return (int) anwser;
	}
}
