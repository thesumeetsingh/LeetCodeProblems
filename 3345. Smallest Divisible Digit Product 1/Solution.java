class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag=false;
        int num=n;
        while(!flag){
            if(flag) break;

            //product of digits
            num=n;
            int prod=1;
            System.out.println("current num: "+num);
            while(num>0){
                int digit= num%10;
                prod*=digit;
                num/=10;
            }
            System.out.println("current product: "+prod);
            if(prod%t==0){
                flag=true;
                System.out.println("found smallest num");
            }
            n++;
        }

        return --n;
    }
}