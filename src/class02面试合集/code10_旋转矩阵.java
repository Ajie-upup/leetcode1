package class02面试合集;

/**
 * @author:hyj
 * @date:2022/10/12
 */
public class code10_旋转矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
        /* 新建了一个数组
        int[][] trans = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                trans[j][matrix.length - i - 1] = matrix[i][j];
            }
        }

        //输出矩阵
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                if (j < trans[i].length - 1) {
                    System.out.print(trans[i][j] + " ");
                } else {
                    System.out.print(trans[i][j]);
                }
            }
            System.out.println();
        }
         */

        //不占用额外空间
        for (int i = 0; i < matrix.length; i++) {

        }


    }
}
