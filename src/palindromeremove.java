// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class palindromeremove {
    public static void removepalin(String h){
        StringBuilder result=new StringBuilder();
 h = h.replace("\"", "");  
        String []y=h.split(" ");
        for(String t:y){
            String reversed=new StringBuilder(t).reverse().toString();
            if(!t.equalsIgnoreCase(reversed)){
                result.append(t).append(" ");
            }
        }
        System.out.print(result.toString().trim());
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String h=sc.nextLine();
      removepalin(h);
    }
}