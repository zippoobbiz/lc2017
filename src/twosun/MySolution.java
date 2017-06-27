package twosun;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

	public static void main(String[] args) {

		MySolution ms = new MySolution();
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] result = ms.twoSum(nums, target);
		// int[] result = ms.twoSumA(nums, target);
		// int[] result = ms.twoSumB(nums, target);
		for (Integer i : result) {
			System.out.println(i);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		return null;
	}

	public int[] twoSumA(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i + 1;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i + 1);
		}
		return result;
	}

	public int[] twoSumB(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
