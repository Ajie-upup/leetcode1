package class01每日一题;

/**
 * @author:hyj
 * @date:2022/10/2
 */
public class code09_在LR中交换相邻字符 {
    //    public static void main(String[] args) {
//        String start = "LR";
//        String end = "RL";
//        int index = 0;
//        while (index < end.length()) {
//            if (index + 1 < end.length() && equal(start.substring(index, index + 2), end.substring(index, index + 2))) {
//                index += 2;
//            } else if (start.charAt(index) == end.charAt(index)) {
//                index++;
//            } else {
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(true);
//    }
//
//    public static boolean equal(String s1, String s2) {
//        StringBuilder sb = new StringBuilder(s1);
//        return sb.toString().equals(s2) || sb.reverse().toString().equals(s2);
//    }
    public static void main(String[] args) {
        String start = "RXXLRXRXL";
        String end = "XRLXXRRLX";
        int n = start.length();
        int i = 0, j = 0;
        while (i < n && j < n) {
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }
            while (j < n && end.charAt(j) == 'X') {
                j++;
            }
            if (i < n && j < n) {
                if (start.charAt(i) != end.charAt(j)) {
                    System.out.println(false);
                }
                char c = start.charAt(i);
                if ((c == 'L' && i < j) || (c == 'R' && i > j)) {
                    System.out.println(false);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (start.charAt(i) != 'X') {
                System.out.println(false);
            }
            i++;
        }
        while (j < n) {
            if (end.charAt(j) != 'X') {
                System.out.println(false);
            }
            j++;
        }
        System.out.println(true);
    }

}
