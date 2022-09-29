package class02面试合集;

/**
 * @author:hyj
 * @date:2022/9/13
 */
public class code01_两数相加 {

    public static class Node {
        int value;
        Node next;
        public Node() {
        }
        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        //模拟输入
        Node node1 = new Node(5);
        Node node2 = new Node(6);
        Node node3 = new Node(4);
        Node node4 = new Node(2);
        Node node5 = new Node(4);
        Node node6 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        Node head1 = node1;
        node4.next = node5;
        node5.next = node6;
        Node head2 = node4;

        Node head3 = new Node(0);
        //记录当前结点
        Node cur = head3;
        //记录当前数之和是否进位
        int temp = 0;
        //判断结束条件，只有当双方都到达最后一个结点的时候才会结束
        while (head1 != null || head2 != null) {
            int x = head1 == null ? 0 : head1.value;
            int y = head2 == null ? 0 : head2.value;
            int sum = x + y + temp;

            temp = sum / 10;
            sum = sum % 10;
            cur.next = new Node(sum);
            cur = cur.next;

            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }
        if (temp == 1) {
            cur.next = new Node(temp);
        }

        while (head3 != null) {
            System.out.print(head3.value+" ");
            head3 = head3.next;
        }
    }
}
