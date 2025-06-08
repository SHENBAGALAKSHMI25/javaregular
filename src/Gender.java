import java.util.Scanner;
class Gender{
public static void main(String[]args){
String v=args[0];
int age=Integer.parseInt(args[1]);
if(v.equalsIgnoreCase("female")){
if(age>1 && age<58){
System.out.print("8.2%");
}
else if(age>59 && age<100){
System.out.println("9.2%");
}
}
else if(v.equalsIgnoreCase("male")){
if(age>1 && age<58){
System.out.println("8.4%");
}
else if(age>59 && age<100)
{
System.out.println("10.5%");
}
else{
System.out.println("invalid gender");
}
}
}
}


