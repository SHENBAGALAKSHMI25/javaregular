// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class subau {
    public static int subarray(int []nums){
int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
int sum=0;
for(int j=i;j<nums.length;j++){
sum=sum+nums[j];
max=Math.max(max,sum);
}
}
return max;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the array size:");
int size=sc.nextInt();
int []nums=new int[size];
System.out.print("enter the array elements:");
for(int i=0;i<size;i++){
nums[i]=sc.nextInt();
}
int r=subarray(nums);
System.out.print(r);
}
}