public class Trees {
    // private static int count = 0;
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
            
        }
    }

    public static int height(TreeNode root){
        if(root==null) return 0;
        // count++;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }


    // public static int count(){
    //     return count;
    // }

    public static int countNodes(TreeNode root){
        if(root==null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static boolean searchValue(TreeNode root, int key){
        if(root==null) return false;
        if(root.data==key) return true;
        return searchValue(root.left, key) || searchValue(root.right, key);
    }

    public static int leafnodes(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return leafnodes(root.left) + leafnodes(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50); 
        // System.out.println("Height of Tree: "+height(root));
        // System.out.println("Number of Nodes: "+countNodes(root));
        // System.out.println("Is 40 in Tree: " + searchValue(root, 40));
        // System.out.println("Is 4 in Tree: " + searchValue(root, 4));
        System.out.println("No. of Leaf Nodes: " + leafnodes(root));
    }
}