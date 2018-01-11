package medianoftwosortedarrays;

public class MySolution {

	public static void main(String args[]) {
		int[] a = {1, 2};
		int[] b = {3, 4};
		System.out.println(findMedianSortedArrays(a, b));
	}

	public static double findMedianSortedArrays(int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k] = a[i];
				i++;
			} else {
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			answer[k] = b[j];
			j++;
			k++;
		}

		if (answer.length % 2 == 0) {
			return (answer[answer.length / 2] + answer[answer.length / 2 - 1]) / 2.0;
		} else {
			return answer[answer.length / 2];
		}
	}

}
