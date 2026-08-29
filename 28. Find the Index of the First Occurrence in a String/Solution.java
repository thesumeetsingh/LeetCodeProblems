class Solution {
    public int strStr(String haystack, String needle){
        int match;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            match=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    match++;
                    continue;
                }else{
                    break;
                }
            }
            if(match==needle.length()){
                // System.out.print("needle found at index: "+i);
                return i;
            }
        }
        // System.out.println("needle not found");
        return -1;
    } 
}