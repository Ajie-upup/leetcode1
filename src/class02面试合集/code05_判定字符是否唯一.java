package class02面试合集;

/**
 * @author:hyj
 * @date:2022/10/4
 */
public class code05_判定字符是否唯一 {
    public static void main(String[] args) {
        String s = "letCode";
        //位运算
        int sum = 0;
        for (char c : s.toCharArray()) {
            if ((sum & (1 << (c - 'a'))) != 0) {
                System.out.println(false);
            }
            sum |= (1 << (c - 'a'));
        }


        /*
        boolean flag = true;
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if (ss.contains(s.charAt(i) + "")) {
                flag = false;
                break;
            }
            ss += s.charAt(i);
        }
        System.out.println(flag);
         */

    }
}
