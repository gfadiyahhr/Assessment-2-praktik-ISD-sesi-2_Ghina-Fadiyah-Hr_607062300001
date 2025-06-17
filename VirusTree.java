public class VirusTree {
    Node root;

    public VirusTree() {
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);
        root.left.left = new Node (2);
        root.right.right = new Node(12);
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper (Node node) {
        if (node == null) {
            return;
        }

        System.out.printf("%f", node.getData());
        preorderHelper(node.left);
        preorderHelper(node.right);
    }

    public boolean checkBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) return true;

        if (node.getData() <= min || node.getData() >= max) return false;

        return isBST(node.left, min, node.getData()) &&
               isBST(node.right, node.getData(), max);
    }
}
