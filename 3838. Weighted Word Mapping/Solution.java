class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char letters[]= {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        String result="";
        for(int i=0;i<words.length;i++){
            int currentWeight=0;

            for(int j=0;j<words[i].length();j++){
                char a= words[i].charAt(j);

                int w=weights[a-'a'];
                currentWeight+=w;
            }

            currentWeight=currentWeight%26;

            result=result+letters[currentWeight];

        }
 
        return result;
    }
}