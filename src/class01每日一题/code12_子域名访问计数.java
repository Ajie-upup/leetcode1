package class01每日一题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map.Entry;

/**
 * @author:hyj
 * @date:2022/10/5
 */
public class code12_子域名访问计数 {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            Integer value = Integer.valueOf(split[0]);
            String[] splits = split[1].split("\\.");
            for (int j = 0; j < splits.length; j++) {
                String code = code(splits, j);
                if (map.containsKey(code)) {
                    Integer count = map.get(code);
                    count += value;
                    map.put(code, count);
                } else {
                    map.put(code, value);
                }
            }
        }
        List<Entry<String, Integer>> lists = new ArrayList<>(map.entrySet());
        List<String> list = new ArrayList<>();
        for (Entry<String, Integer> entry : lists) {
            list.add(entry.getValue() + " " + entry.getKey());
        }
        System.out.println(list);

    }

    public static String code(String[] splits, int num) {
        String temp = "";
        for (int j = num; j < splits.length; j++) {
            if (j != splits.length - 1) {
                temp += splits[j] + ".";
            } else {
                temp += splits[j];
            }
        }
        return temp;
    }
}
