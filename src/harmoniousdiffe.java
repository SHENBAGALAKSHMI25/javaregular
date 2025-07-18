import java.util.*;
class harmoniousdiffe {
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
            int curr=freq.get(m);
            if(freq.containsKey(m+1)){
                curr=curr+freq.get(m+1);
            }
            if(freq.containsKey(m+2)){
                curr=curr+freq.get(m+2);
            }
                max=Math.max(max,curr);
            }
        
        return max;
    }
    public static void main(String[]args){
        int nums[]={1, 2, 2, 3, 1, 2};
        int res=findLHS(nums);
        System.out.print(res);
    }
}