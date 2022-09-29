package class01每日一题;

import java.util.Scanner;

/**
 * @author:hyj
 * @date:2022/9/25
 */
public class code02_788旋转数字 {
    static int[] check = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String s = String.valueOf(i);
            boolean valid = true, diff = false;
            for (int j = 0; j < s.length(); ++j) {
                char ch = s.charAt(j);
                if (check[ch - '0'] == -1) {
                    valid = false;
                } else if (check[ch - '0'] == 1) {
                    diff = true;
                }
            }
            if (valid && diff) {
                count++;
            }
        }
        System.out.println(count);
    }
}
