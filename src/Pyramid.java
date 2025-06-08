public class Pyramid{
public static void main(String []args){
char ch='A';
for(int i=1;i<=5;i++){
for(int s=i;s<=5-1;s++){
System.out.print(" ");
}
for(int j='A';j<'A'+(i*2-1);j++){
System.out.print(j+"");
}
System.out.println( );
}
}
}