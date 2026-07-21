class Solution {
    public int peakIndexInMountainArray(int[] arr)  {
        int mid=0;
        int left=0, right=arr.length-1;
        if(arr.length==3){
            return 1;
        }
        while(left<=right){
            mid=(left+right)/2;

            if(mid-1>=0 && mid+1<arr.length && (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])){
                return mid;
            }
            
                if(arr[mid]<arr[mid+1]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            
        }
        return mid;
    }
}