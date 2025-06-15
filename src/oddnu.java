public class oddnu{
public static void main(String[]args){
int v=361589;
int o=0;
int e=0;
int sum=0;
while(v>0){
int d=v%10;
if(d%2!=0){
o=o*10+d;
sum=sum+d;
}
else{
e=e*10+d;
}
v=v/10;
}
int y=0;
while(o>0){
int r=o%10;
y=y*10+r;
o=o/10;
}

int u=0;
while(e>0){
int e2=e%10;
u=u*10+e2;
e=e/10;
}

System.out.println(sum);
System.out.println(y);
System.out.println(u);
}
}