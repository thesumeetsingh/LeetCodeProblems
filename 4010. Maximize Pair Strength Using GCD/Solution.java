class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
    int max=0;
    double strength=0;
    for(int i=0;i<nums.length;i++){
        for (int j = i + 1; j < nums.length; j++){
            if(i==j)continue;
            
            
            long currStrength=(1L*nums[i]*nums[j])/(gcd(nums[i],nums[j])*gcd(nums[i],nums[j]));
            if (currStrength>strength){
                strength=currStrength;
            }
        }
    }
    return (long)strength;
    }
}