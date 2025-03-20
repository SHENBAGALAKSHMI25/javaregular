import java.util.Scanner;

public class simbataxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter taxi number:");
        String taxino = sc.next();
        System.out.println("enter distance travelled:");
        int distance=sc.nextInt();
        if(distance <=5){
            System.out.println("Amount:100");
        }
        else if (distance <=15){
            System.out.println("Amount:"+distance*10);
        }
        else if(distance <=25){
            System.out.println("Amount:"+distance*8);
        }
        else{
            System.out.println("Amount:"+distance*5);
        }
    }
}


