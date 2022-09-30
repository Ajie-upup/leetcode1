package class01每日一题;

import java.util.HashMap;

/**
 * @author:hyj
 * @date:2022/9/30
 */
public class code07_零矩阵 {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {

        HashMap<Integer, Node> map = new HashMap<>();
        int count = 0;
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    Node node = new Node(i, j);
                    map.put(count, node);
                    count++;
                }
            }
        }
        count--;
        while (count >= 0) {
            Node node = map.get(count);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == node.x) {
                        arr[i][j] = 0;
                    }
                    if (j == node.y) {
                        arr[i][j] = 0;
                    }
                }
            }
            count--;
        }

    }
}
