class Solution {
    public int removeElement(int[] nums, int val){
        int  writeIndex=0;
  
        for(int i=0;i<nums.length;i++){
            if(writeIndex<nums.length && nums[i]!=val){
                nums[writeIndex]=nums[i];
                writeIndex++;
            }
        }

        return writeIndex;
    }

}