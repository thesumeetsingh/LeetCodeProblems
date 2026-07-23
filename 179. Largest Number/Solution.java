class Solution {
    public String largestNumber(int[] nums) {
        int n= nums.length;
        String elements[] = new String[n];
        for(int i=0;i<n;i++){
            elements[i]= Integer.toString(nums[i]);
        }

        Arrays.sort(elements, (a, b)-> (a+b).compareTo((b+a)));


        

        StringBuilder res= new StringBuilder();
        for(String s: elements){
            res.insert(0,s);
        }


        if(res.charAt(0)=='0') return "0";
       
        return res.toString();
    }
}