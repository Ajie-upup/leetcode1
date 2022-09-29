package class01每日一题;

import java.util.Scanner;

/**
 * @author:hyj
 * @date:2022/9/27
 */
public class code04_面试01_02_判断是否互为字符重排 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "abcd";
        String s2 = "bcad";
        /*
        方法一：排序
        if (s1.length() != s2.length()) {
            System.out.println(false);
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println((Arrays.equals(chars1, chars2)));
         */
        //方法二：频次统计
        //字符串只包含 128 种不同的字符
        if (s1.length() != s2.length()) {
            System.out.println(false);
        }
        int[] count = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
            if (count[s2.charAt(i)] < 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
