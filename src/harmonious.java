import java.util.*;
class harmonious {
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int n:nums){
            if(freq.containsKey(n)){
                freq.put(n,freq.get(n)+1);
           }
           else{
            freq.put(n,1);
           }
        }
        int max=0;
        for(int m:freq.keySet()){
            if(freq.containsKey(m+1)){
                int curr=freq.get(m)+freq.get(m+1);
                max=Math.max(max,curr);
            }
        }
        return max;
        
    }
    public static void main(String[]args){
        int nums[]={10, 11, 11, 12, 13, 13, 13};
        int res=findLHS(nums);
        System.out.print(res);
    }
}