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
    public int max=Integer.MIN_VALUE;
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        que.add(null);
        int sum=0;
        int level=0;
        int maxLevel=0;

        while(!que.isEmpty()){
            TreeNode curr= que.remove();

            if(curr==null){
                level++;
                if(sum>max){
                    max=sum;
                    
                    maxLevel=level;
                }
                if(que.isEmpty()){
                    break;
                }else{
                    que.add(null);
                }
                sum=0;
            }else{
                sum+=curr.val;
                if(curr.left!=null)que.add(curr.left);
                if(curr.right!=null)que.add(curr.right);
            }
        }

        return maxLevel;
    }
}