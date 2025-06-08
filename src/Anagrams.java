public class Anagrams{
public static void main(String[]args){
int[]freq=new int[26];
int count=0;
String s1="diesnh";
String s2="henisd";
for(int i=0;i<s1.length();i++){
freq[s1.charAt(i) -'a']++;
}
for(int j=0;j<s2.length();j++){
freq[s2.charAt(i)-'a']--;
}
for(int n:freq){
if(count==0)
{
return false;
}
return true;
}
}
}