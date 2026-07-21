class Solution {
    Boolean jumpable[];
    public boolean can(int[] nums, int curr){
        if(curr>=nums.length-1){
            return true;
        }
        if(jumpable[curr]!=null){
            return jumpable[curr];
        }
        int maxJump=nums[curr];
        for(int j=1;j<=maxJump;j++){
            if(can(nums, curr+j)){
                jumpable[curr]=true;
                return true;
            }
        }
        jumpable[curr]=false;
        return false;
    }
    public boolean canJump(int[] nums) {
        jumpable= new Boolean[nums.length];
        return can(nums, 0);
    }
}