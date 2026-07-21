import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public void levelOrderTraversal(TreeNode node, List<List<Integer>> list){
        if(node==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(node);
        queue.add(null);
        List<Integer> level= new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode currentNode=queue.remove();
            if(currentNode==null){
                list.add(level);
                List<Integer> newlevel= new ArrayList<>();
                level=newlevel;
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                level.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        

        List<List<Integer>> result=new ArrayList<List<Integer>>();
        levelOrderTraversal(root, result);
        return result;
    }
}