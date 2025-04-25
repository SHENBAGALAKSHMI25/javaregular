public class Identifier1 {
public static void main(String[] args){
String s = "@rollno";

for(int i = 0; i < s.length(); i++) {
char c = s.charAt(i);

if(i == 0) {
if(!((c == '$') || (c == '_') || (c >= 65 && c <= 90) || (c >= 97 && c <= 122))) {
System.out.println("Identifier is invalid");
break;
}
}

else {
if(!((c == '$') || (c == '_' ) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57))) {
System.out.println("Identifier is invalid");
break;
}
}
if(i == s.length() - 1) {
System.out.println("Identifier is valid");
}
}
}
}
