import java.util.*;

class Perfect {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want:");
        int n = st.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }

        //  setting as set
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        //finded minumum count
        int minCount = Collections.min(frequencyMap.values());

        
        System.out.print("Numbers appearing the least times: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == minCount) {
                System.out.print(entry.getKey() + " ");
            }
        }

        st.close();
    }
}
