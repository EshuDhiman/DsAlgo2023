package Questions.BinaryTree;

class TreeNode {
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

public class Solution {
    public static void main(String[] args) {
        TreeNode p = new TreeNode();
        p.val = 1;
        p.left.val = 2;
        p.right.val = 1;
        TreeNode q = new TreeNode();
        q.val = 1;
        q.left.val = 1;
        q.right.val = 2;
        // isSameTree
        isSameTree(p, q);
    }

    // functions

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p != null && q != null) && (p.val == q.val)) {
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
