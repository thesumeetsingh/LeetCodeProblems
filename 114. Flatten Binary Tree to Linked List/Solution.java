/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ArrayList<TreeNode> list= new ArrayList<>();
    public void flat(ArrayList<TreeNode> list, TreeNode root){
        if(root==null){
            return;
        }
        list.add(root);

        if(root.left!=null){
            flat(list, root.left);
        }
        if(root.right!=null){
            flat(list, root.right);
        }
    }


    public void flatten(TreeNode root) {
        TreeNode head= new TreeNode();

        flat(list, root);
        if(list.isEmpty()) return;
        root= list.get(0);
        for(int i=0;i<list.size();i++){
            head.left=null;
            head.right=list.get(i);
            head=head.right;
        }


    }
}