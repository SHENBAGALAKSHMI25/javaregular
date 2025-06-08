public class Kadanmaxsub{
public static void main(String[] args){
int nums[]={-2,-3,-5,8,9,7};
int max=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<nums.length;i++){
sum=sum+nums[i];
if(sum > max){
max=sum;
}
if(sum<0){
sum=0;
}
}
System.out.print(max);
}
}

