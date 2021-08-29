package Tree;

public class _112_Path_Sum {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n11 = new TreeNode(11);
        TreeNode n13 = new TreeNode(13);

        n5.left = n4; n5.right = n8;
        n4.left = n11;
        n11.left = n7; n11.right = n2;
        n8.left = n13; n8.right = n4;
        n4.right = n1;

        System.out.println(hasPathSum(n5, 26));

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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }else {
            if(root.left == null && root.right == null && targetSum - root.val == 0) {
                return true;
            }else{
                return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
            }
        }
    }
}
