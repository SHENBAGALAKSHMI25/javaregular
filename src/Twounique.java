import java.util.HashSet;
public class Twounique{
public static void main(String[]args){
int [] n={9,8,7,7};
HashSet<Integer>set=new HashSet<>();
for(int n2:n){
if(set.contains(n2)){
set.remove(n2);
}
else{
set.add(n2);
}
}
int []result=new int[2];
for(int p:set){
result[i]=p[i];
}
System.out.print(result);
}
}