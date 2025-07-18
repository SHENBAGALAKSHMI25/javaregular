import java.util.*;
class subse{
public static int subsedp(String s1,String s2){
int m=s1.length();
int n=s2.length();
int maxlen=0;
int [][]dp=new int[m+1][n+1];
for(int i=1;i<=m;i++){
for(int j=1;j<=n;j++){
if(s1.charAt(i-1)==s2.charAt(j-1)){
dp[i][j]=1+dp[i-1][j-1];
}
else{
dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
}
}
}
return dp[m][n];
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the new string1:");
String s1=sc.nextLine();
System.out.print("enter the new string2:");
String s2=sc.nextLine();
int result=int subsedp(s1,s2);
System.out.print(result);
}
}

