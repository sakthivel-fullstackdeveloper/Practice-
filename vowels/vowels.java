import java.util.Scanner;
class  vowels{
public static void main(String[] args){
    System.out.println("print the vowels in your word");
    Scanner st = new Scanner(System.in);
    System.out.println("enter the string");
    String inp = st.nextLine();
    char[] s= inp.toCharArray();
    
    for(char i:s)
    {
        switch (i) {
            case 'a':{System.out.println(i); break;}
            case 'e':{System.out.println(i); break;}
            case 'i':{System.out.println(i); break;}
            case 'o':{System.out.println(i); break;}
            case 'u':{System.out.println(i); break;}
            }
                
    }
    st.close();
    } 
}
