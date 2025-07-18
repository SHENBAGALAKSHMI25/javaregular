import java.util.*;
class pair{
    public static int count(int tot,int[][]nums2) {
        int[] r1=nums2[0];
        int []r2=nums2[1];
        int cnt=0;
        for(int i=0;i<r1.length;i++){
            for(int j=0;j<r2.length;j++){
                if(r1[i]+r2[j]==tot){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the total:");
        int tot=sc.nextInt();
        System.out.print("enter the array size:");
        int s=sc.nextInt();
        int[][]nums2=new int[2][s];
        System.out.print("enter the array of row:");
        for(int i=0;i<s;i++){
            nums2[0][i]=sc.nextInt();
        }
        for(int j=0;j<s;j++){
            nums2[1][j]=sc.nextInt();
        }
        
        int result = count(tot, nums2);
        System.out.println("Total valid pairs: " + result);
    }
}