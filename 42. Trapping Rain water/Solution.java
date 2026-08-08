class Solution {
    public int trap(int[] height){
        int volume=0;
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        int prevLMax=0, prevRMax=0,currL=0, currR=0;
        for(int i=0;i<height.length;i++){
            currL=height[i];
            currR=height[height.length-1-i];
            if(currL>prevLMax){
                prevLMax=currL;               
            }
            leftMax[i]=prevLMax;
            if(currR>prevRMax){
                prevRMax=currR;
            }
            rightMax[rightMax.length-1-i]=prevRMax;
        }
        for(int i=0;i<height.length;i++){
            volume=volume+(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        // System.out.print(volume);
        return volume;
    }
}