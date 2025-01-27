import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("CHECK THE NEXT LETTERS:");

        Scanner sp = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char userInput = sp.next().charAt(0);

        System.out.print("Enter how many letters you want: ");
        String userlength = sp.next();
        int len =Integer.parseInt(userlength);

        System.out.println("Your letter is : " + userInput);
        System.err.println("your next "+ len +" letters"); 

        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
            int change = ((int)userInput)+i;
            char next= (char)change;
            System.out.print(next);
            }
           System.out.println("");
        }    

    }
}