public class Cognizant1{
public static void main(String[]args){
int N=5;
int r=0;
int K=5;
int []a={12,9,10,15,5};
for(int i=0;i<a.length;i++){
if(a[i]>K){
int c=a[i]-K;
if(c>K){
r++;
}
}
}
System.out.println(r);
}
}
