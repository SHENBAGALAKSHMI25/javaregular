public class Countsing{
public static void main(String []args){
int v=978977;
int count=0;
while(v>0){
int d=v%10;
v/=10;
if(d==7){
count ++;
}
}
System.out.print(count);
}
}
 