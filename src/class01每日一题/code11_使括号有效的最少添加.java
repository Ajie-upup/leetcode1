package class01每日一题;

/**
 * @author:hyj
 * @date:2022/10/4
 */
public class code11_使括号有效的最少添加 {
    public static void main(String[] args) {
        String s = "()))((";
        int cnt = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                ++cnt;
            } else if (cnt > 0) {
                --cnt;
            } else {
                ++ans;
            }
        }
        System.out.println(ans + cnt);


        /* 方法二：使用栈 ---- 但是内存消耗较大，入栈和出栈也消耗了大量的时间
        String s = "()))((";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
                continue;
            }
            if (stack.peek() != c && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        System.out.println(stack.size());
         */

        /* 方法三： ------  改变了原来的字符串
        String s = "()))((";
        while(s.contains("()")) {
            s = s.replace("()","");
        }
        System.out.println(s.length());
         */


    }
}
