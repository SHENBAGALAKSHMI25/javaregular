import java.util.*;
class subarr{
    public static int minimum(int []a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            int min=a[i];
            for(int j=i;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                }
                sum=sum+min;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the arraysize:");
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.print("enter the array elements:");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(minimum(a));
    }
}