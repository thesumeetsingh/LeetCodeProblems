class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map= new HashMap<>();
        int result=0;
        
        for(int i=0;i<word.length();i++){
            char s=word.charAt(i);
            if(s>='a' && s<='z'){
                
                map.put(s, i); 
            }else{
                if(!map.containsKey(s)){
                    map.put(s, i); 
                }  
            }
        }

        for(int i=65;i<=90;i++){
            char lower= (char)(i+32);
            char upper= (char)(i);
            if(map.containsKey(lower) && map.containsKey(upper)){
                if(map.get(lower)<map.get(upper)){
                    result++;
                }
            }
        }

        return result;
    }
}