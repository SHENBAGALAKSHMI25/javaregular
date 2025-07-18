import java.util.*;
class virtusa3usestringmethod{
public static String swappingcharacter(String s1,int m2,int[]m3){
char y[]=s1.toCharArray();
int length=s1.length()/2;
char []temp=new char[length];
for(int j=0;j<m3.length;j++){
if(m3[j]==1){
char tep=y[0];
y[0]=y[y.length-1];
y[y.length-1]=tep;
}
else if(m3[j]==2){
for(int i=0;i<length;i++){
temp[i]=y[i];
}
for(int i=y.length-length;i<y.length;i++){
y[i-length]=y[i];
}
for(int i=0;i<length;i++){
y[length+i]=temp[i];
}
}
}
return new String(y);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the String:");
String s1=sc.nextLine();
System.out.print("enter the array size:");
int m2=sc.nextInt();
int m3[]=new int[m2];
System.out.print("enter the array elements:");
for(int i=0;i<m2;i++){
m3[i]=sc.nextInt();
}
String res=swappingcharacter(s1,m2,m3);
System.out.print(res);
}
}
