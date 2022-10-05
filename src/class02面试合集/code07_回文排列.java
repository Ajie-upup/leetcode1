package class02面试合集;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:hyj
 * @date:2022/10/5
 */
public class code07_回文排列 {
    public static void main(String[] args) {
        String s = "tactcoa";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                count++;
            }
        }
        if (count <= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
