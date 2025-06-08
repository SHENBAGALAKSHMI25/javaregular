public class Cognizant3{
public static void main(String[]args){
String v="a123d89y";
boolean flag =false;
int count=0;
for(int i=0;i<v.length();i++){
char ch=v.charAt(i);
if(Character.isDigit(ch)){
flag=true;
}
else{
if(flag){
flag=false;
}
count++;
}
}
System.out.print(count);
}
}
