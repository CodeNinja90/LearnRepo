public class SecondLargest {

    public static void main(String[] args) {
        int[] nums = {-1,1,-2};
     //   int[] nums = {10, 5, 20, 10, 8, 20, 15, 15, 12, 8};


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if there's a second largest number
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number in the array.");
        }
}
    
}
