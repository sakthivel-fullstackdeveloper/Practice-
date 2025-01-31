import java.util.*;
class mm{
   public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    System.out.println("Please enter number:");
    int n = st.nextInt();
    st.close();
    if(n%27==0){
        System.out.println("it is divisible by 27");
    }
    else{
        System.out.println("it is not divisible by 27");
    }
   }
}