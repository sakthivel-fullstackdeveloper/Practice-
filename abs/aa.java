import java.util.*;
public class aa {
  public static void main(String[] args) {
    Scanner st = new Scanner(System.in);
    System.out.println("Please enter a:");
    int a = st.nextInt();
    System.out.println("Please enter b:");
    int b = st.nextInt();
    int c=0;
    st.close();
    if(a<0){
        a= a*-1;
        if(a-b<0){
        c=(a-b)*-1;}
        else{
            c=a-b;
        }
        
    }
    else if(b<0){
        b= a*-1;
        if(a-b<0){
        c=(a-b)*-1;}
        else{
            c=a-b;
        }
  }  
  else{
    if(a-b<0){
    c=(a-b)*-1;}
    else{
        c=a-b;
    }
}
}
}
