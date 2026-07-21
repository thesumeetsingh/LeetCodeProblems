import java.util.*;


class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char arr[][]=new char[numRows][s.length()];
        int index=0;
        int r=0, c=0;
        int dir=-1;

        String str=" ";
        while(index!=s.length()){
            
            if(r<=numRows-1 && dir==-1){
                arr[r][c]=s.charAt(index);
                r++; //move down
                index++; //next character
                continue;
            }
            if(r==numRows){
                r=r-2;
                dir=1;
                c++;
                continue;
            }

            if(dir==1 && r>=0){
                arr[r][c]=s.charAt(index);
                index++;
                r--;
                c++;
                continue;
            }

            if(r<0 && dir==1){
                dir=-1;
                r=1;
                c--;

            }
        }
        StringBuilder sb=new StringBuilder();
        
        for(char a[]:arr){
            for(char j: a){
                if(j!='\0'){
                    sb.append(j);
                }
            }
        }
        
        return sb.toString();


    }
}