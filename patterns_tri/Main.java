package patterns_tri;

import java.util.Scanner;

public class Main {
    public int i,j,k;
    
    public void pattern_1(){
        for (i=1;i<=5;i++){
            System.out.println();        
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
    }
    
    public void pattern_2(){
    String s = "* ";
    for(i=5;i>=1;i--){
    System.out.println("");
    System.out.print(s.repeat(i));
    }
    }
   
    public void pattern_3(){
        for(i=1;i<5;i++){
        System.out.println("");
        for(j=0;j<=i-1;j++){
            System.out.print(" ");
        }
        for(k=5;k>=i;k--){
            System.out.print("*");
        }
        }
        
    }
    
    public void pattern_4(){
        for(i=0;i<5;i++){
            System.out.println("");
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
        }
    }
   
    public void pattern_5(){
        // Scanner sc = new Scanner(System.in);
       
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            String a = "*";
            System.out.print(a.repeat(i));
            for(j=0;j<i-1;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        Main s = new Main();
        // s.pattern_1();
        // System.out.println();
        // s.pattern_2();
        // System.out.println();
        // s.pattern_3();
        // System.out.println();
        // s.pattern_4();
        // System.out.println();
        s.pattern_5();
    }

}