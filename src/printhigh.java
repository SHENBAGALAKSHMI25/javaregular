import java.util.*;
class printhigh{
public static void highfree(String s){
HashMap<Character,Integer>map=new HashMap<>();
char u[]=s.toCharArray();
for(char y:u){
if(map.containsKey(y)){
map.put(y,map.get(y)+1);
}
else{
map.put(y,1);
}
}
int max=0;
char ch=' ';
for(char key:map.keySet()){
if(map.get(key)>max){
max=map.get(key);
ch=key;
}
else if(map.get(key)==max){
if(key<ch){
ch=key;
}
}
}
System.out.print("high freq character :"+ ch +" high freq:"+max);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the string:");
String s=sc.nextLine();
highfree(s);
}
}