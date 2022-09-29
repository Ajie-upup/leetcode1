package class01每日一题;

import java.util.ArrayList;

/**
 * @author:hyj
 * @date:2022/9/26
 */
public class code03_面试1719消失的两个数字 {
    static ArrayList<Integer> array = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1};
        if (nums.length == 1) {
            miss(1, nums[0]);
        }
        if (nums[0] > 1) {
            miss(1, nums[0]);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                miss(nums[i - 1], nums[i]);
            }
        }
        if (array.size() == 0) {
            array.add(nums[nums.length - 1] + 1);
            array.add(nums[nums.length - 1] + 2);
        }
        if (array.size() == 1) {
            array.add(nums[nums.length - 1] + 1);
        }
        int[] arr2 = new int[]{array.get(0), array.get(1)};
        for (int i : arr2) {
            System.out.println(i);
        }

    }

    public static void miss(int num1, int num2) {
        if (array.size() == 2) {
            return;
        }
        for (int i = num1; i <= num2; i++) {
            if (i != num2 && !array.contains(i)) {
                array.add(i);
            }
        }
    }
}
