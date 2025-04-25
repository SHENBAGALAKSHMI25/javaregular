class add{
public static void main(String []args){
String s="5gtfif55yu6";
int sum=0;
String aa=" ";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isDigit(ch)){
aa += ch;
}
else{
if(!aa.equals("")){
sum=sum+Integer.parseInt(aa);
aa="";
}
}
}
if(!aa.isEmpty("")){
sum+=Integer.parseInt(aa);
}
System.out.println(sum);
}
}