package class05课程;

/**
 * @author:hyj
 * @date:2022/10/14
 */
public class code01_找到两个链表相交的第一个结点 {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    //找到第一个入环结点，没有则返回空
    public static Node getFirstIn(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node slow = head.next;
        Node fast = head.next.next;

        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        // slow fast  相遇
        //将fast重头开始，slow与fast一次一步，两者一定会在入环结点相遇
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //如果两个链表都无环，则返回第一个相交结点，否则返回null
    public static Node noLoop(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        int len = 0;
        //找到两个链表的长度差值
        while (cur1 != null) {
            len++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            len--;
            cur2 = cur2.next;
        }
        //将长的链表赋给cur1，将短的链表赋给cur2
        cur1 = len > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        len = Math.abs(len);
        //遍历找到第一个相交结点
        while (len != 0) {
            len--;
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    //两个又换链表，返回相交结点，不相交则返回null
    public static Node twoLoop(Node head1, Node loop1, Node head2, Node loop2) {
        Node cur1 = null;
        Node cur2 = null;

        if (loop1 == loop2) {
            cur1 = head1;
            cur2 = head2;
            int len = 0;
            //找到两个链表的长度差值
            while (cur1 != loop1) {
                len++;
                cur1 = cur1.next;
            }
            while (cur2 != loop2) {
                len--;
                cur2 = cur2.next;
            }
            //将长的链表赋给cur1，将短的链表赋给cur2
            cur1 = len > 0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            len = Math.abs(len);
            //遍历找到第一个相交结点
            while (len != 0) {
                len--;
                cur1 = cur1.next;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else {
            cur1 = loop1.next;
            while (cur1 != loop1) {
                if (cur1 == loop2) {
                    return cur1;
                }
                cur1 = cur1.next;
            }
            return null;
        }
    }

    //找到两个链表的相交的第一个结点
    public static Node getFirstInsertIn(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node loop1 = getFirstIn(head1);
        Node loop2 = getFirstIn(head2);

        if (loop1 == null && loop2 == null) {
            return noLoop(head1, head2);
        }

        if (loop1 != null && loop2 != null) {
            return twoLoop(head1,loop1,head2,loop2);
        }
        return null;
    }

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getFirstInsertIn(head1, head2).value);

        // 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(getFirstInsertIn(head1, head2).value);

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getFirstInsertIn(head1, head2).value);

    }

}
