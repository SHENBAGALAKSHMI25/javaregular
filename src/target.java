import java.util.*;
public class target{
public static int[] tar(int []s,int output){
for(int i=0;i<s.length-1;i++){
int sum=0;
sum=s[i]+s[i+1];
if(sum==output){
return new int[]{i, i+1};
}
}
return new int[]{-1,-1};
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the array size:");
int size=sc.nextInt();
System.out.print("enter the output:");
int output=sc.nextInt();
int s[]=new int[size];
System.out.print("enter the b array:");
for(int i=0;i<size;i++){
s[i]=sc.nextInt();
}

int []r=tar(s,output);
System.out.print(Arrays.toString(r));
}
}
