package class01每日一题;

import java.util.Arrays;

/**
 * @author:hyj
 * @date:2022/10/8
 */
public class code13_优势洗牌 {
    public static void main(String[] args) {
        int[] num1 = {2, 7, 11, 15};
        int[] num2 = {1, 10, 4, 11};
        int[] num = new int[num1.length];
        int j=0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] > num2[i]) {
                num[j] = num1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
