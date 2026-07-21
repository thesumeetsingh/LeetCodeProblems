import java.util.*;

class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set= new HashSet<>();
        int points=0;
        for(int i=0;i<password.length();i++){
            char c= password.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                if(c<='z' && c>='a'){
                    points++;
                }else if(c<='9' && c>='0'){
                    points+=3;
                }else if(c<='Z' && c>='A'){
                    points+=2;
                }else if(c=='!' || c=='@' || c=='#' || c=='$'){
                    points+=5;
                }
            }
        }

        return points;
    }
}