class Main {
    public static void main(String[] args) {
        VirusTree tree = new VirusTree();
        tree.preorderTraversal();
        System.out.println("\nApakah BST? " + tree.checkBST()); 
    }
}
