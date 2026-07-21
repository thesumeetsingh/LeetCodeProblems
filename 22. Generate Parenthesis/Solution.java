import java.util.*;

class Solution {
    public List<String> res= new ArrayList<>();

    public void recurse(int open, int close, StringBuilder current,int n){
        if(open==n && close ==n){
            res.add(current.toString());
            return;
        }

        if(open<n){
            current.append("(");
            recurse(open+1, close, current, n);
            current.deleteCharAt(current.length()-1);
        }
        if(close<open){
            current.append(")");
            recurse(open, close+1, current, n);
            current.deleteCharAt(current.length()-1);
        }
        return;

    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb= new StringBuilder();
        recurse(0,0,sb,n);

        return res;
        
    }
}