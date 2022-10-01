package class01每日一题;

/**
 * @author:hyj
 * @date:2022/10/1
 */
public class code08_重新格式化电话号码 {
    public static void main(String[] args) {
        String s = "--17-5 229 35-39475 ";
        s = s.replace("-", "");
        s = s.replace(" ", "");
        String ss = "";
        int index = 0;
        int n = s.length();
        while (n > 4) {
            for (int i = 0; i < 3; i++) {
                ss += s.charAt(index);
                index++;
            }
            ss += "-";
            n -= 3;
        }
        if (n == 4) {
            ss += s.charAt(index);
            ss += s.charAt(index + 1);
            ss += "-";
            ss += s.charAt(index + 2);
            ss += s.charAt(index + 3);
        } else {
            for (int i = index; i < s.length(); i++) {
                ss += s.charAt(i);
            }
        }
        System.out.println(ss);
    }
}
