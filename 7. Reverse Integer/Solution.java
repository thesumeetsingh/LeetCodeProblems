class Solution {
    public int reverse(int x)   {
        int flag=0, reversed=0, lastDigit=0;
        int min=Integer.MIN_VALUE, max=Integer.MAX_VALUE;
        if(x==0){
            return 0;
        }
        if(x<0){
            x=-1*x;
            flag=1;
        }
        while(x>0){
            lastDigit=x%10;
            if (reversed > Integer.MAX_VALUE / 10 || 
            (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
            return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }
            reversed=(reversed*10)+lastDigit;
     
            x/=10;
        }
        if(flag==1){
            reversed= -1*reversed;
            if(reversed<min){
                return 0;
            }
            return reversed;
        }else{
            if(reversed>max){
                return 0;
            }
            return reversed;
        }
    }
}