package class04顺序;

/**
 * @author:hyj
 * @date:2022/10/15
 */
public class code04_整数反转 {
    public static void main(String[] args) {
        int num = -123;
        int tag = 0;
        while (num != 0) {
            int x = num % 10;
            if (tag > Integer.MAX_VALUE / 10 || (tag == Integer.MAX_VALUE / 10 && x > 7)) {
                System.out.println(0);
                System.exit(0);
            }
            if (tag < Integer.MIN_VALUE / 10 || (tag == Integer.MIN_VALUE / 10 && x < -8)) {
                System.out.println(0);
                System.exit(0);
            }
            tag = tag * 10 + x;
            num /= 10;
        }
        System.out.println(tag);
    }
}
