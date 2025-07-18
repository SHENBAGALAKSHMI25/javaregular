import java.util.*;
class Maxdifk {
    public static int findLHS(int[] nums,int k) {
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
            if(freq.containsKey(m+k)){
                curr=curr+freq.get(m+k);
            
            // if(freq.containsKey(m+2)){
            //     curr=curr+freq.get(m+2);
            // }
                max=Math.max(max,curr);
            }
            }
        
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the k value:");
        int k=sc.nextInt();
        System.out.print("enter the array size:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int res=findLHS(nums,k);
        System.out.print(res);
    }
}