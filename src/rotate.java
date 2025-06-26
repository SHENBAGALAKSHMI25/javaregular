import java.util.*;
public class rotate {
    public static int [] rotarr(int num[],int d,int n){
        int temp[]=new int[num.length];
        for(int i=0;i<d;i++){
            temp[i]=num[i];
        }
        for(int i=d;i<num.length;i++){
            num[i-d]=num[i];
            }
       for(int i=0;i<d;i++){
           num[n-d+i]=temp[i];
       }
        return num;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.print("enter array size:");
         int n=sc.nextInt();
         int num[]=new int[n];
         System.out.print("enter the d value:");
         int d=sc.nextInt(); 
System.out.print("enter array elements:");
for(int i=0;i<num.length;i++){
num[i]=sc.nextInt();
}
System.out.print(Arrays.toString(rotarr(num,d,n)));
}
}