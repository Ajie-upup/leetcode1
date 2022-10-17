package class05课程;

/**
 * @author:hyj
 * @date:2022/10/17
 */
public class code02_递归求二叉树遍历 {
    //RecursiveTraversal
    public static class Node {
        public int value;
        private Node left;
        private Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    //遍历二叉树
    public static void fun(Node head) {
        if (head == null) {
            return;
        }
        fun(head.left);
        fun(head.right);
    }

    //先序遍历打印所有结点
    public static void pre(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.value+" ");
        pre(head.left);
        pre(head.right);
    }

    //中序遍历打印所有结点
    public static void mid(Node head){
        if (head == null){
            return;
        }
        mid(head.left);
        System.out.print(head.value+" ");
        mid(head.right);
    }

    //后序遍历打印所有结点
    public static void pos(Node head){
        if (head == null){
            return;
        }
        pos(head.left);
        pos(head.right);
        System.out.print(head.value+" ");
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        pre(head);
        System.out.println();
        mid(head);
        System.out.println();
        pos(head);
        System.out.println();
    }
}
