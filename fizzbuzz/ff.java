import java.util.*;
 class ff
 {
    public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    System.out.println("Please enter number:");
    int n = st.nextInt();
    st.close();
    System.out.println("the elements which are divisble by"+ n +":");
    for (int i = 1; i <= n; i++) {
        if(i%3==0 && i%5!=0){
            System.out.println("fizz");
        }
        else if(i%5==0 && i%3!=0){
            System.out.println("buzz");
        }
        else if(i%3==0 && i%5==0){
            System.out.println("fizzbuzz");
        }
        else{
            System.out.println(i);
        }
    }


   


    }
    
    
} 
