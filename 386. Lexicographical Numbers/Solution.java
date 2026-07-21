import java.util.*;

class Solution {
    class Node{
        boolean eow;
        Node children[] = new Node[10];

        Node(){
            this.eow=false;
            this.children= new Node[10];
        }
        Node(boolean eow, Node[] children){
            this.eow= eow;
            this.children= children;
        }

        public void insertTrie(int val){
            Node curr= this;
            Integer i= val;
            String value=i.toString();

            for(int k=0;k<value.length();k++){
                if(curr.children[value.charAt(k)-'0']!=null){
                    curr= curr.children[value.charAt(k)-'0'];
                    continue;
                }else{
                    curr.children[value.charAt(k)-'0']= new Node();
                    curr=curr.children[value.charAt(k)-'0'];
                }
            }

            curr.eow= true;
        }

        public void dfs(List<Integer> res, Node root, String curr){
            if(root.eow){
                int val= Integer.parseInt(curr);
                res.add(val);
            }

            for(int i=0;i<root.children.length;i++){
                if(root.children[i]!=null){
                    dfs(res, root.children[i], curr+i);
                }
            }

            return;

        }
    }


    public List<Integer> lexicalOrder(int n) {
        List<Integer> res= new ArrayList<>();
        Node trie= new Node();
        for(int i=1;i<=n;i++){
            trie.insertTrie(i);
        }

        trie.dfs(res, trie, "");
        return res;
    }
}