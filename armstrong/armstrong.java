import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("enter the num 1: ");
        int num1 = st.nextInt();
        System.out.println("enter the num 2: ");
        int num2 = st.nextInt();
        System.out.println("enter the num 3: ");
        int num3 = st.nextInt();
        if(num1>num2){
            if (num1>num3) {
                System.out.println("a is greater");
            }
    
            else if(num1==num3){
                System.out.println("a and c  is greater");
            }

            else if(num1<num3){
                System.out.println("c is greater");
            }
        }
        else if(num2>num1){
            if (num2>num3) {
                System.out.println("b is greater");
            }
    
            else if(num2==num3){
                System.out.println("b and c  is greater");
            }

            else if(num2<num3){
                System.out.println("c is greater");
            }
    
        }

        else if(num1==num2 && num1==num3){
            System.out.println("a,b,c  all are greater and same");

        }
        else if(num3>num1 && num3>num2){
            System.out.println("c is greater");
        }
        st.close();
    }
}