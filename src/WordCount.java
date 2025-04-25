public class WordCount{
public static void main(String[] args){
String s="I am an Indian";
String ss=s.trim();
int word_count=1;
for(int i=0;i<s.length();i++){
char c = ss.charAt(i);
if(c==' '){
word_count++;
} 

}
System.out.println("count:"+word_count);
}
}























