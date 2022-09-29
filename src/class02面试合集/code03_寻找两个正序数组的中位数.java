package class02面试合集;

/**
 * @author:hyj
 * @date:2022/9/21
 */
public class code03_寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3};

        int[] help = merge(a, b);
        int mid = help.length / 2;
        if (help.length % 2 != 0) {
            System.out.printf("%.5f", help[mid]);
        } else {
            System.out.printf("%.5f", (double) (help[mid] + help[mid + 1]) / 2);
        }

    }

    public static int[] merge(int[] a, int[] b) {
        int m = a.length + b.length;
        int[] help = new int[m];
        int i = 0, j = 0, k = 0;
        while (j < a.length && k < b.length) {
            help[i++] = a[j] <= b[k] ? a[j++] : b[k++];
        }
        while (j < a.length) {

            help[i++] = a[j++];
        }
        while (k < b.length) {
            help[i++] = b[k++];
        }
        return help;
    }
}
