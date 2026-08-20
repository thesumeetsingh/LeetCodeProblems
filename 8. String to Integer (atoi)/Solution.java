class Solution {
    public int myAtoi(String s) {
            int i=0;
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }//now i points at first non space character

            boolean positive=true;
            if(i<s.length() && s.charAt(i)=='-'){
                positive=false;;
                i++;
                if(i< s.length() && s.charAt(i)=='+'){
                    return 0;
                }
            }
            if(i< s.length() && s.charAt(i)=='+'){
                positive=true;
                i++;
                if(i<s.length() && s.charAt(i)=='-'){
                    return 0;
                }
            }


            //skipping leading zeroes
            while(i<s.length() && s.charAt(i)=='0'){
                i++;
            }

            //now i points at first digit;
            long lower= Integer.MIN_VALUE;
            long upper= Integer.MAX_VALUE;
            int num=0;

            if(positive){
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    int curr=(s.charAt(i)-'0');
                    if(num<=(upper-curr)/10){
                        num=num*10+curr;
                        i++;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
            }else{
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    int curr=(s.charAt(i)-'0');
                    if(-1*(num)>=(lower+curr)/10){
                        num=num*10+curr;
                        i++;
                    }else{
                        return Integer.MIN_VALUE;
                    } 
                }              
            }
            
            

            if(!positive){
                return -1*num;
            }
            return num;
    }
}