class Solution {
    public int romanToInt(String s) {
        

        StringBuilder sb=new StringBuilder(s);

        int ans=0;
        int idx=s.length()-1;
        while(idx>=0){
            if(s.charAt(idx)=='I'){
                ans+=1;
            }else if(s.charAt(idx)=='V'){
                ans+=5;
                idx--;
                while(idx>=0 && s.charAt(idx)=='I'){
                    ans-=1;
                    idx--;
                }
                continue;
            }else if(s.charAt(idx)=='X'){
                ans+=10;
                idx--;
                while(idx>=0 && s.charAt(idx)=='I'){
                    ans-=1;
                    idx--;
                }
                continue;
            }else if(s.charAt(idx)=='L'){
                ans+=50;
                idx--;
                while(idx>=0 && idx>=0 && s.charAt(idx)=='X'){
                    ans-=10;
                    idx--;
                }
                continue;
            }else if(s.charAt(idx)=='C'){
                ans+=100;
                idx--;
                while(idx>=0 && s.charAt(idx)=='X'){
                    ans-=10;
                    idx--;
                }
                continue;
            }else if(s.charAt(idx)=='D'){
                ans+=500;
                idx--;
                while(idx>=0 && s.charAt(idx)=='C'){
                    ans-=100;
                    idx--;
                }
                continue;
            }else if(s.charAt(idx)=='M'){
                ans+=1000;
                idx--;
                while(idx>=0 && s.charAt(idx)=='C'){
                    ans-=100;
                    idx--;
                }
                continue;
            }
            idx--;
        }

        return ans;
    }
}