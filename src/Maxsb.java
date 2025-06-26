import java.util.*;
public class Maxsb {
    public static int[] max(int n[],int k){
        int max=Integer.MIN_VALUE;
       
        Scanner sc=new Scanner(System.in);
System.out.print("enter array size:");
        int k=sc.nextInt();
        int n[]=new int[k];
System.out.print("enter array elements:");
for(int i=0;i<n.length;i++){
n[i]=sc.nextInt();
}
        for(int i=0;i<n.length;i++){
            int sum=0;
            for(int j=i;j<n.length;j++){
                sum=sum +n[i];
                max=Math.max(sum,max);
            }
        }
        
        
        
        return max;
    }
public static void main(String[] args) {
max(n);
}