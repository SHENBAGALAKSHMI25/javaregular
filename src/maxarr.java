public class maxarr {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
       
        int a[]={2, 3, -8, 7, -1, 2, 3};
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum +a[j];
                
            }
            if(sum>max){
              
            max=sum;
            }
        }
        
        
        
        System.out.print(max);
    }
}