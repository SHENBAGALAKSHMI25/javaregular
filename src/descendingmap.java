import java.util.*;
class descendingmap{
    public static void desmap(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        char []t=s.toCharArray();
        for(char y:t){
            if(map.containsKey(y)){
                map.put(y,map.get(y)+1);
        }
        else{
            map.put(y,1);
        }
    }
    List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
    list.sort((a,b)->b.getValue().compareTo(a.getValue()));
    for(Map.Entry<Character,Integer>entry:list){
        System.out.println(entry.getKey()+"->"+entry.getValue());
    }
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the string:");
    String s=sc.nextLine();
    desmap(s);
}
}