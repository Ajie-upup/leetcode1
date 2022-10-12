package class02面试合集;

/**
 * @author:hyj
 * @date:2022/10/10
 */
public class code09_字符串压缩 {
    /*
        public static void main(String[] args) {
//        String s = "aaabbbcccddd";
        String s = "abbccd";
        //字符串为空的判断
        if (s.length() == 0) {
            System.exit(0);
        }
        int count = 1;
        char a = s.charAt(0);
        String ss = "" + a;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == a) {
                count++;
            } else {
                ss += count;
                count = 1;
                ss += c;
                a = c;
            }
        }
        ss += count;
        System.out.println(ss.length() >= s.length() ? s : ss);
    }
     */
    public static void main(String[] args) {
        String s = "aaabbbcccddd";
//        字符串为空的判断
        if (s.length() == 0) {
            System.exit(0);
        }
        int count = 1;
        char a = s.charAt(0);
        StringBuffer sbf = new StringBuffer();
        for (int i = 1; i < s.length(); ++i) {
            if (a == s.charAt(i)) {
                count++;
            } else {
                sbf.append(a);
                sbf.append(count);
                a = s.charAt(i);
                count = 1;
            }
        }
        sbf.append(a);
        sbf.append(count);
        System.out.println(sbf.length() >= s.length() ? s : sbf.toString());
    }


}
