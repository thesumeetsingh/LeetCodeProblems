class Solution {
    class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children= new Node[26];
            eow=false;
        }

        public void insert(String s){
            Node curr= root;
            char c= 'a';
            int idx=0;
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                idx=c-'a';
                if(curr.children[idx]!=null){
                    curr=curr.children[idx];
                }else{
                    curr.children[idx]= new Node();
                    curr=curr.children[idx];
                }
            }

            curr.eow=true;
        }

        public boolean search(String s){

            Node curr= root;
            char c= 'a';
            int idx=0;
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                idx=c-'a';
                if(curr.children[idx]!=null){
                    curr=curr.children[idx];
                }else{
                    return false;
                }
            }
            return curr.eow;

        }
    }

    public Node root= new Node();
    public String longestCommonPrefix(String[] strs) {
        for(String s: strs){
            root.insert(s);
        }

        System.out.println(root.search(strs[0]));

        StringBuilder sb= new StringBuilder();

        String s= strs[0];
        Node pointer= root;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int idx=c-'a';
            int count=0;
            if(pointer.children[idx]!=null){
                for(Node n: pointer.children){
                    if(n!=null){
                        count++;
                    }
                }

                if(count>1){
                    return sb.toString();
                }
                else if(pointer.eow){
                    return sb.toString();
                }else{
                    count=0;
                    sb.append(c);
                    pointer= pointer.children[idx];
                }
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}