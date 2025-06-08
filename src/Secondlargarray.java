public class Secondlargarray{
public static void main(String[]args){
int []a={1,2,4,5,7,6};
int lar=Integer.MIN_VALUE;
int sec=Integer.MIN_VALUE;
for(int i=2;i<a.length;i++){
if(a[i]>lar){
sec=lar;
lar=a[i];
}
else if(a[i]>sec && a[i]!=lar){
sec=a[i];
}
}
System.out.println(sec);
}
}
