public class TreeDay2 {
    
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    // Renamed method from sumOfNodes to calculateTreeSum
    public static int calculateTreeSum(TreeNode root) {
        if (root == null) return 0;
        return root.data + calculateTreeSum(root.left) + calculateTreeSum(root.right);
    }

    // Renamed method from printKLevel to displayLevelNodes
    public static void displayLevelNodes(TreeNode root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            displayLevelNodes(root.left, level - 1);
            displayLevelNodes(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        System.out.println("Sum of all nodes: " + calculateTreeSum(root));

        System.out.print("Nodes at level 2: ");
        displayLevelNodes(root, 2);
        System.out.println();
    }
}
