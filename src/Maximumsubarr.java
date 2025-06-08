public class Maximumsubarr{
public static void main(String[]args){
int maxi=Integer.MIN_VALUE;
int nums[]={-2,1,-3,4,-1,2,1,-5,4};
for(int i=0;i<nums.length;i++){
int sum=0;
for(int j=1;j<nums.length;j++){
sum=sum+nums[j];
maxi=Math.max(sum,maxi);
}
}
System.out.print(maxi);
}
}