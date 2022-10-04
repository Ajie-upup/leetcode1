package class02面试合集;

/**
 * @author:hyj
 * @date:2022/10/4
 */
public class code06_URL化 {
    public static void main(String[] args) {
//        String s = "     ";
        String s = "Mr John Smith    ";
        int length = 13;
        String ss = s.substring(0, length).replace(" ", "%20");
        System.out.println(ss);
    }
}
