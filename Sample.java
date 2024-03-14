import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {

            //Annagram
            String s1 = "abc";
            String s2 = "cba";

            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean result = Arrays.equals(c1, c2);

            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }


        }    

        // Find Second Largest number in array 
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = arr[0];
        int secondLargest = arr[0];


        



        
        
        

        

    
}
