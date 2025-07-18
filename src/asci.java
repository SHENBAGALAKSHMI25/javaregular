import java.util.*;
class asci{
    public static int valuescha(int k){
        StringBuilder word=new StringBuilder("a");
        int sum=0;
        while(word.length()<k){
int len=word.length();
        for(int i=0;i<len;i++){
            char current=word.charAt(i);
            char next = (current == 'z') ? 'a' : (char)(current + 1);
            word.append(next);
    
        
        int diff=0;
        for(int s=0;s<k;s++){
            diff=(char)next-(char)current;
           sum=sum+diff;
}
}
}

        
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
System.out.print("enter the k value:");
       int k=sc.nextInt();
       int result=valuescha(k);
       System.out.print("sum of the ASCII values:"+result);
    }
}