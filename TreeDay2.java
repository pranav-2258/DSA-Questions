public class TreeDay2 {
    
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
            
        }
    }

    public static int sumOfNodes(TreeNode root) {
        if (root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void printKLevel(TreeNode root, int k) {
        if (root == null) return;
        if (k == 1) {
            System.out.print(root.data + " ");
        } else {
            printKLevel(root.left, k - 1);
            printKLevel(root.right, k - 1);
        }
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
 
        System.out.println("Sum of all nodes: " + sumOfNodes(root));

        System.out.print("Nodes at level 2: ");
        printKLevel(root, 2);
        System.out.println();
    }
}