public class Post4{
public static void main(String[]args){
int v[]={5,2,5,4,8,9};
for(int i=0;i<v.length;i++){
if(nums[i]==4){
int r[]=new int[nums.length-i-1];
for(int j=i+1;j<v.length;j++){
r[j-i-1]=v[j];
}
return r;
}
}
return new int[0];
}c