public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] uniqueArray2;
        int spliceIndex=0;

        System.out.println("Original array 1: " + java.util.Arrays.toString(arr1));
        spliceIndex = removeDuplicates(arr1);
        int[] uniqueArray1 = new int[spliceIndex];

        for (int i = 0; i < spliceIndex; i++) {
            uniqueArray1[i] = arr1[i];
        }

        System.out.println("Unique array 1: " + java.util.Arrays.toString(uniqueArray1));


       
    

        System.out.println("Original array 2: " + java.util.Arrays.toString(arr2));
        spliceIndex = removeDuplicates(arr2);
        uniqueArray2 = new int[spliceIndex];

        for (int i = 0; i < spliceIndex; i++) {
            uniqueArray2[i] = arr2[i];
           // System.out.println(uniqueArray2[i]);
        }

        System.out.println("Unique array 2: " + java.util.Arrays.toString(uniqueArray2));




    }

    public static int removeDuplicates(int[] arr) {
        int writePointer = 1;
        for (int readPointer = 1; readPointer < arr.length; readPointer++) {
            if (arr[writePointer - 1] != arr[readPointer]) {
                arr[writePointer] = arr[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}
