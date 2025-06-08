public class Countzeroonetwo{
public static void main(String[]args){
int []v={0,2,1,0,2,1,2,1,1,1,0};
int n=v.length;
int c0=0;
int c1=0;
int c2=0;
for(int i=0;i<n;i++){
if(v[i]==0) {
c0++;
}
else if(v[i]==1){
c1++;
}
else if(v[i]==2){
c2++;
}
}
for(int i=0;i<c0;i++){
v[i]=0;
}
for(int i=c0;i<c0+c1;i++){
v[i]=1;
}
for(int i=c0+c1;i<n;i++){
v[i]=2;
}
for(int n2:v){
System.out.print(n2+"");
}
}
}
