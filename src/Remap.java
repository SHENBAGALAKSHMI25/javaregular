public class Remap{
public int remappingdidgit(){
int h=11891;
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
String v=Integer.toString(h);
for(char i='0';i<='9';i++){
String temp=v.replace(i,'9');
int value=Integer.parseInt(temp);
if(value>max){
max=value;
}
}
}
for(char i=0;i<='9';i++){
String temp2=v.replace(i,'0');
int vale=Integer.parseInt(temp2);
if(vale<min){
min=vale;
}
}
}
return max-min;
}

public static void main(String[]args){
Remap d=new Remap();
d.remappingdigit();
}
}
