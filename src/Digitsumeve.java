public class Digitsumeve{
public static void main(String[]args){
int v=89765;
while(v>10){
int sum=0;
while(v>0){
int d=v%10;
if(d%2!=0){
sum=sum+d;
}
v/=10;
}
v=sum;
}
System.out.println(v);
}
}