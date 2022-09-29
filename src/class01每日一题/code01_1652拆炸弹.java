package class01每日一题;

/**
 * @author:hyj
 * @date:2022/9/24
 */
public class code01_1652拆炸弹 {
    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};
        int k = -2;

        code = after(code);
        code = trans(-k, code);
        int[] help2 = after(code);

        for (int i = 0; i < code.length; i++) {
            System.out.print(help2[i] + " ");
        }

    }

    public static int[] after(int[] code) {
        int[] help = new int[code.length];
        int len = code.length - 1;
        for (int i = 0; i < code.length; i++) {
            help[len - i] = code[i];
        }
        return help;
    }

    public static int[] trans(int k, int[] code) {
        int[] help = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            for (int j = 1; j <= k; j++) {
                int num = (i + j) % code.length;
                help[i] += code[num];
            }
        }
        return help;
    }
}
