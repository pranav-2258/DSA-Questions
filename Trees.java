public class Trees {
    
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    // Renamed from height to getTreeHeight
    public static int getTreeHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Renamed from countNodes to totalNodeCount
    public static int totalNodeCount(TreeNode root) {
        if (root == null) return 0;
        return 1 + totalNodeCount(root.left) + totalNodeCount(root.right);
    }

    // Renamed from searchValue to findValueInTree
    public static boolean findValueInTree(TreeNode root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return findValueInTree(root.left, key) || findValueInTree(root.right, key);
    }

    // Renamed from leafnodes to countLeafNodes
    public static int countLeafNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        // System.out.println("Height of Tree: " + getTreeHeight(root));
        // System.out.println("Number of Nodes: " + totalNodeCount(root));
        // System.out.println("Is 40 in Tree: " + findValueInTree(root, 40));
        // System.out.println("Is 4 in Tree: " + findValueInTree(root, 4));
        System.out.println("No. of Leaf Nodes: " + countLeafNodes(root));
    }
}
