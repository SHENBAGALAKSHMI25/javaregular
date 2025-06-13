public class Smallarray{
public static void main(String []args){
int []v={2, 3, 1, 2, 4, 3};
int v2=v.length;
int k=7;
int count=0;
int sum=0,l=0,r=0;
int min=Integer.MAX_VALUE;
while(r<v2){
sum=sum+v[r];
while(sum>=k){
min=Math.min(min,r-l+1);
sum=sum-v[l];
l++;
}
r++;
}
if (min == Integer.MAX_VALUE) {
System.out.println();
}
else{
System.out.println(min);
}
}
}


