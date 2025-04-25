class Demo1{
public static void main(String[] args){
String s = "5ing55t6g";

for(int i=0;i<s.length();i++){
char ch = s.charAt(i);
if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
vc+=1;
}
else
{
c+=1;
}
}
else if(ch>=48 && ch<=57){
nc+=1;
}
else{
sp+=1;
}
}

System.out.println("vowel count:"+vc);
System.out.println("consonant count:"+c);
System.out.println("number count:"+nc);
System.out.println("special character count:"+sp);


}
}
