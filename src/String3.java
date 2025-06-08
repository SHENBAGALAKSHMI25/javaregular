public class String3{
public static void main(String[]args) {
String str="chocolate";
  String v;
  if(str.length() < 3){
    v = str.repeat(3);
  } else { 
    v = str.substring(0, 3);
    v = v.repeat(3);
  }
  System.out.println(v);
}
}
