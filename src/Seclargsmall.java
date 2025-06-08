class Seclargsmall {
int[] nums={5,7,6,-9,10};
public int secondLargestElement() {
int lar=Integer.MIN_VALUE;
int sec=Integer.MIN_VALUE;
for(int n:nums){
if(n>lar){
sec=lar;
lar=n;
}
else if(n>sec && n!=lar){
sec=n;
}
}
return sec ==Integer.MIN_VALUE ? -1 : sec;
}
public int secondSmallestElement(){
int l=Integer.MAX_VALUE;
int s=Integer.MAX_VALUE;
for(int f:nums){
if (f<l){
s=l;
l=f;
}
else if(f<s && f!=l){
s=f;
}
} 
return s==Integer.MAX_VALUE ?-1:s;
}
public static void main(String[]args){
Seclargsmall v=new Seclargsmall();
System.out.println(v.secondLargestElement());
System.out.println(v.secondSmallestElement());
}
}