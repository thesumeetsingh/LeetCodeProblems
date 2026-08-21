class Solution {
    public int maxArea(int[] height) {
        int volume=0;
        int l=0;
        int r=height.length-1;
        int currVol=0;
        while(l<r){
            currVol=Math.min(height[l],height[r])*(r-l);
            if(currVol>volume){
                volume=currVol;
            }

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return volume;
    }
}