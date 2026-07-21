class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqSum=0;

        int number=n;
        while(number>0){
            int digit=number%10;
            sum=sum+digit;
            sqSum+=Math.pow(digit, 2);
            number/=10;
        }

        if(sqSum-sum>=50)return true;

        return false;
        
    }
}