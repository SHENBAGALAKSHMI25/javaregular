import java.util.*;
class dist{
    public static int longdis(int[] arr){
         HashMap<Integer,Integer>map=new HashMap<>();
         int max=-1;
        int result=-1;
        for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],i);
        }
        else{
            int dist=i-map.get(arr[i]);
            if(dist>max){
                max=dist;
                result=arr[i];
            }
        }
    }
    return result ;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int v=sc.nextInt();
        int []arr=new int[v];
        System.out.print("enter array elements:");
        for(int i=0;i<v;i++){
            arr[i]=sc.nextInt();
        }
        int r=longdis(arr);
        System.out.print(r);
    }
    }
