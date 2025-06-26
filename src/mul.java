import java.util.*;
class mul{
    public static int[]mularr(int nums[],int d){
        int mul=1;
        for(int i=0;i<nums.length;i++){
            mul=mul*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=mul/nums[i];
            }
    return nums;
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
        System.out.print(Arrays.toString(mularr(nums,d)));
    }
}