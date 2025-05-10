package array_s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String skip = sc.nextLine();
        String str = sc.nextLine();
        int choice= sc.nextInt();
        String[] parts = str.split(" ");
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        Arrays.sort(arr);
        ArrayList<Integer> sorts = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        if(choice == 1){
            System.out.print("The minimum number is "+sorts.get(0));
        }
        else if(choice == 2){
            System.out.print("The maximum number is "+sorts.getLast());
        }
        else if(choice == 3){
            int value = 0;
            for(int i=0;i<len;i++){
                value+=sorts.get(i);
            }
            float result = (float) value / len;
            System.out.print("The average number is "+ result);
        }
        else if(choice==4){
            int value = 0;
            for(int i=0;i<len;i++){
                value+=sorts.get(i);
            }
            System.out.print("The sum of number is "+ value);
        }
        else{
            System.out.print("The choice is invalid");  
        }

        sc.close();
    }
}
