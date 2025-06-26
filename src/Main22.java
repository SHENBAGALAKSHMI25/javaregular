import java.util.*;
public class Main22 {
    public static void main(String[] args) {
        int i=0;
        
       int temp=0;
        int n[]={2, 3, -8, 7, -1, 2, 3};
int j=n.length-1;
        while(i<=j){
          temp=n[i];
          n[i]=n[j];
          n[j]=temp;
          i++;
          j--;
        
        }
        
        
        
        System.out.print(Arrays.toString(n));
    }
}