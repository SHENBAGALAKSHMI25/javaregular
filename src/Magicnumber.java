public class Magicnumber{
public static void main(String[]args){
int v=1024;//50113
while(v>9){
int sum=0;
while(v>0){
sum=sum+v%10;
v=v/10;
}
v=sum;
}
if(v==1){
System.out.println("it is a magic number");
}
else{
System.out.println("it is not a magic number");
}
}
}

