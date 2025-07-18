import java.util.*;
class trapezium{
public static void trapezium(int rows){
for(int i=1;i<=rows;i++){
int hashes=rows -i;
int dashes=i;
for(int j=1;j<=hashes;j++){
System.out.print("#");
}
for(int j=1;j<=dashes;j++){
System.out.print("-");
}
for(int j=1;j<=hashes;j++){
System.out.print("#");
}
System.out.println();
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();
trapezium(rows);
sc.close();
}
}