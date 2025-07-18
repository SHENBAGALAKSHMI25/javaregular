import java.util.*;
class maxmisub{
public  static ArrayList<Integer> subar(int []a,int k){
ArrayList<Integer>lu=new ArrayList<>();
for(int i=0;i<=a.length-k;i++){
int max=a[i];
for(int j=i;j<i+k;j++){
max=Math.max(max,a[j]);
}
lu.add(max);
}
return lu;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the k value:");
int k=sc.nextInt();
System.out.print("enter the array size:");
int size=sc.nextInt();
int []a=new int[size];
System.out.print("enter the array elements:");
for(int i=0;i<size;i++){
a[i]=sc.nextInt();
}
ArrayList<Integer>shen= subar(a,k);
System.out.print("maximum in the array:"+shen);
}
}