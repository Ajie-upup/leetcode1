package class04顺序;

/**
 * @author:hyj
 * @date:2022/10/16
 */
public class code05_字符串转整数atoi {
    public static void main(String[] args) {
        String s = "4193 with words";
        String s1 = s.trim();
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (!(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')) {
                index++;
            } else {
                break;
            }
        }
        int last = index;
        for (int i = index; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                last++;
            } else {
                break;
            }
        }
        String s2 = s1.substring(index, last);
        if (index > 0 && s1.charAt(index - 1) == '-') {
            if (Long.parseLong(s2) < Integer.MAX_VALUE + 1) {
                System.out.println(-(Integer.parseInt(s2)));
            }

        } else {
            if (Long.parseLong(s2) < Integer.MAX_VALUE) {
                System.out.println(-(Integer.parseInt(s2)));
            }
        }
    }
}
