import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2="";
        for (int i= str1.length() - 1; i >= 0 ; i--) {
            str2 += (str1.charAt(i));
        }
        sc.close();
        if (str1.equals(str2)){

            System.out.println("its palindrome "+str1+" "+str2);
        }
        else{
            System.out.println("its not palindrome "+str1+" "+str2);
        }
    }
}
