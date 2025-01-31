import java.util.*;

class dd {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = st.nextInt();
        st.close();
        

        System.out.println("the elements which are divisble by"+n+":");
        for (int i = 1; i <= n; i++) {
          if(n%i==0){
          System.out.println(i);
          }
        }

        
        }
  
       
    }

