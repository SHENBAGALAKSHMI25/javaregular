// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class dupmid {
    public static int midle(int []a){
        int dinesh=Math.round(a.length/2);
        for(int i=0;i<a.length;i++){
            // int start=a[i];
            for(int j=dinesh;j<a.length;j++){
                if(a[i]==a[j]){
                    // cnt++;
                //   start=a[j];  
                return a[j];
                }
                
            }
        }
        return -1;
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
        int c=midle(a);
        System.out.println("majority element after half:"+ c);
    }
}