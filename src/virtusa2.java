import java.util.*;
class virtusa2{
public static void smallerafter(int[]nums){
int count=0;
ArrayList<Integer>list=new ArrayList<>();
for(int i=0;i<nums.length;i++){
for(int j=i+1;j<nums.length;j++){
if(nums[i]==nums.length-1){
list.add(count);
}
else if(nums[i]>nums[j]){
count++;
}
}
list.add(count);
count=0;

}
System.out.print(list);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the size:");
int size=sc.nextInt();
int []nums=new int[size];
System.out.print("enter the array:");
for(int i=0;i<size;i++){
nums[i]=sc.nextInt();
}
smallerafter(nums);
}
}


