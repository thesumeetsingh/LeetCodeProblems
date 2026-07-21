class Solution {
    public int maxNumberOfBalloons(String text) {
        StringBuilder sb= new StringBuilder(text);

        boolean flag=true;
        int instance=0;

        while(flag){
            if(sb.toString().contains("b")){
                sb.deleteCharAt(sb.indexOf("b"));
            }else{
                return instance;
            }
            if(sb.toString().contains("a")){
                sb.deleteCharAt(sb.indexOf("a"));
            }else{
                return instance;
            }
            if(sb.toString().contains("l")){
                sb.deleteCharAt(sb.indexOf("l"));
            }else{
                return instance;
            }
                        if(sb.toString().contains("l")){
                sb.deleteCharAt(sb.indexOf("l"));
            }else{
                return instance;
            }
                        if(sb.toString().contains("o")){
                sb.deleteCharAt(sb.indexOf("o"));
            }else{
                return instance;
            }
                        if(sb.toString().contains("o")){
                sb.deleteCharAt(sb.indexOf("o"));
            }else{
                return instance;
            }
                        if(sb.toString().contains("n")){
                sb.deleteCharAt(sb.indexOf("n"));
            }else{
                return instance;
            }

            instance++;
        }

        return instance;
    }
}