package Tree;

public class _700_Search_in_a_Binary_Search_Tree {
    public static void main(String[] args) {

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }else if(root.val == val) {
            return root;
        }else if(root.val > val) {
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right,val);
        }
    }
}
