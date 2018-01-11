package reverseinteger;

public class MySolution {
    public static int reverse(int x) {
        String s = x + "";
        String result = "";
        if (s.charAt(0) == '-') {
            s = s.substring(1);
            result += '-';
        }
        char[] c = s.toCharArray();
        for (int i = c.length-1; i >= 0; i--) {
            result += c[i];
        }
        int answer = 0;
        try {
        	answer = Integer.parseInt(result);
        } catch (Exception e){

        }
        return answer;
    }

    public static void main(String[] args) {
    	System.out.println(reverse(1534236469));
    }
}
