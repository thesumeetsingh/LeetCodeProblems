class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb= new StringBuilder();

        int sum=0;
        while(n>0){
            int digit= n%10;
            sum+=digit;
            if(digit>0){
                sb.insert(0, digit);
            }
            n/=10;
        }

        if(sb.length()==0){
            return 0;
        }
 
        String num= sb.toString();
        long x= Long.parseLong(num);

        return x*sum;
    }
}