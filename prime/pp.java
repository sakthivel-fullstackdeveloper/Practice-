import java.util.*;
class pp  {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = st.nextInt();
        st.close();
        int count=0;
        for (int index = 0; index <= n; index++) {
          if (n%index==0) {
            count+=1;
          } 

          if(count==2){
            System.out.println("its prime");
          }
          else{
            System.out.println("its not prime");
          }
        }
    }
}
