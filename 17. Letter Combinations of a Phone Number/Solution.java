class Solution {
    String characters[]=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void combinations(String digits, List<String> result, int idx, String characters[], String currentString){
        if(idx==digits.length()){
            result.add(currentString);
            return;
        }

        char currentdigit=digits.charAt(idx);
        String letters=characters[currentdigit-'2'];


        for(int i=0;i<letters.length();i++){
            combinations(digits, result, idx+1, characters, currentString+letters.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        String currentString=new String();
        combinations(digits, result, 0, characters,currentString);


        return result;
    }
}