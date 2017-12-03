/*
https://leetcode.com/articles/merge-two-binary-trees/
https://leetcode.com/problems/merge-two-binary-trees/description/
The merge rule is that if two nodes overlap, 
then sum node values up as the new value of the merged node. 
Otherwise, the NOT null node will be used as the node of new tree. 
*/
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
}
 
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        
        if (t2 == null) {
            return t1;
        }
        
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }   
}
