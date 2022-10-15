package class04顺序;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:hyj
 * @date:2022/10/15
 */
public class code03_Z字型变换 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        if (numRows < 2) {
//            return s;
            System.out.println(s);
            System.exit(0);
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
//        return res.toString();
        System.out.println(res.toString());
    }
}
