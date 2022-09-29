package class02面试合集;

import java.util.TreeMap;

/**
 * @author:hyj
 * @date:2022/9/20
 */
public class code02_无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "dvdf";
        char[] chars = s.toCharArray();
        String temp = "";
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "");
        int j = 0, i = 0;
        while (i < chars.length) {
            String charString = Character.toString(chars[i]);
            if (temp.contains(charString)) {
                map.put(temp.length(), temp);
                temp = "";
                j++;
                i = j;
            } else {
                temp += charString;
                i++;
            }
        }
        map.put(temp.length(), temp);
        System.out.println(map.lastKey());
    }
}
