import java.util.*;
class Selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr);
for(int i:arr){
System.out.print(i+" ");
//System.out.print(Arrays.toString(arr));
        }
}
    public static void selectionsort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}