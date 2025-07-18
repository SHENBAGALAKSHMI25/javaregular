import java.util.*;

class Stringen {
    public static void encoding(String s){
        StringBuilder v=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                 v=v.append(s.charAt(i-1));
        v=v.append(count);
        count=1;
            }
            
        } 
        v.append(s.charAt(s.length()-1));
        v.append(count);
       
        
    
        System.out.print(v);
        }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the new string:");
        String s=sc.nextLine();
        encoding(s);
    }
}