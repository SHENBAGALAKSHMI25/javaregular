public class Armstrong{
public static void main(String []args){
int num=9474;
int temp=num;
int original= num;
int count=0;
while(temp!=0){
count++;
temp/=10;
}
temp=num;
int sum=0;
while(temp!=0){
 int d=temp%10;
sum+=(int)Math.pow(d,count);
temp/=10;
}
if(sum == original){
System.out.println(original +"is the armstrong");
}
else{
System.out.println(original +"is not the armstrong");
}
}
}
