public class SecondLargest {

    public static void main(String[] args) {
        int[] nums = { -1, 1, -2 };
        // int[] nums = {10, 5, 20, 10, 8, 20, 15, 15, 12, 8};

        /**
         * Represents the largest value found so far.
         */
        int biggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else if (num > secondBiggest && num != biggest) {
                secondBiggest = num;
            }
        }

        // Check if there's a second largest number
        if (secondBiggest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondBiggest);
        } else {
            System.out.println("There is no second largest number in the array.");
        }
    }

}
