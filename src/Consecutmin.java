//"Remove One Consecutive Group to Minimize String Length"//
import java.util.*;
public class Consecutmin{
public static int minimizelength(String word){ 
int max=Integer.MIN_VALUE;
int length=1;
for(int i=1;i<word.length();i++){
if(word.charAt(i)==word.charAt(i-1)){
length++;
}
else{
length=1;
}
max=Math.max(max,length);
}
int mini=word.length()-max;
return mini;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the string:");
String word=sc.nextLine();
int result= minimizelength(word);
int n=word.length();
System.out.println("the original length :"+n);
System.out.println("the minimized length :"+result);
}
}
