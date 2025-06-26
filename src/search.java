import java.util.*;
class search{
    public static int[]search(int []nums){
        int search=10;
        int j=1;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        
        if(nums[i]==search){
            list.add(j);
            j++;
        }
        }
        int[] finalar=new int[list.size()];
        for(int i=0;i<list.size();i++){
            finalar[i]=list.get(i);
        }
        return finalar;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int d=sc.nextInt();
        int []nums=new int[d];
        System.out.print("enter the array elements:");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(search(nums)));
    }
    

}