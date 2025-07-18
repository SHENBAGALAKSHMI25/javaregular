import java.util.*;
class addzer{
    public static ArrayList<Integer> tas(ArrayList<Integer> ar,int size,int k){
        ArrayList<Integer>li=new ArrayList<>(ar);
        for(int i=0;i<size;i++){
            if(li.get(i)==k){
                li.add(i+1,k);
                i++;
            }
        }
        while(li.size()>ar.size()){
            li.remove(li.size()-1);
        }
        return li;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.print("enter the array size:");
        int size=sc.nextInt();
        ArrayList<Integer>ar=new ArrayList<>(size);
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++){
            ar.add(sc.nextInt()); 
            
        }
        ArrayList<Integer> li=tas(ar,size,k);
        System.out.print(li);
    }
}