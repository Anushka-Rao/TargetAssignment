public class BinaryTree {
    static class Node
    {
        public char data;
        public Node left, right;
    };
    static void printLeafNodes(Node root)
    {
        if (root == null)
            return;
        if (root.left == null &&
                root.right == null)
        {
            System.out.print(root.data + " ");
            return;
        }
        if (root.left != null)
            printLeafNodes(root.left);
        if (root.right != null)
            printLeafNodes(root.right);
    }
    static Node newNode(char data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static void main(String []args)
    {
        Node root = newNode('A');
        root.left = newNode('B');
        root.right = newNode('F');
        root.left.left = newNode('C');
        root.left.right = newNode('E');
        root.left.left.left = newNode('D');
        root.right.left = newNode('G');
        root.right.right = newNode('H');
        root.right.right.right = newNode('K');
        printLeafNodes(root);
    }
}
