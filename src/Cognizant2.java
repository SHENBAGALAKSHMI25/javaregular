public class Cognizant2{
public static void main(String[]args){
String s="aabbbccdeeea";
int prev=s.charAt(0);
for(int i=1;i<s.length();i++){
if(s.charAt(i)==prev){
s.charAt(i)=#;
}
}
System.out.print(s);
}
}