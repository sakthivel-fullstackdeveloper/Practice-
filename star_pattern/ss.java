import java.util.Scanner;
class ss  {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        int n= st.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        st.close();
    }
}
