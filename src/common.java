import java.util.*;
public class common{
public static ArrayList<Integer> element(int b[],int a[]){
ArrayList<Integer>ar=new ArrayList<>();
HashMap<Integer,Integer>map=new HashMap<>();
for(int num:b){
if(map.containsKey(num)){
map.put(num,map.get(num)+1);
}
else{
map.put(num,1);
}
}
for(int num:a){
if(map.containsKey(num) && map.get(num)>0){
ar.add(num);
map.put(num,map.get(num)-1);
}
}
return ar;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the array size:");
int size=sc.nextInt();
int b[]=new int[size];
int a[]=new int[size];
System.out.print("enter the b array:");
for(int i=0;i<size;i++){
b[i]=sc.nextInt();
}
System.out.print("enter the a array:");
for(int i=0;i<size;i++){
a[i]=sc.nextInt();
}
System.out.print(element(b,a));
}
}

