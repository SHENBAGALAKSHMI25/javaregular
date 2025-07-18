// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class startnd {
    public static int endeqstrt(int []a){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            int start=a[i];
            for(int j=i;j<a.length;j++){
                if(start==a[j]){
                    cnt++;
                //   start=a[j];  
                }
                
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.print("enter the array elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        } 
        int c=endeqstrt(a);
        System.out.println("total subarray:"+ c);
    }
}