public class Learning {

    public static void main(String[] args) {
        String str = "Hello World";
        boolean result = isVowelPresent(str);
        System.out.println("Is vowel present? " + result);
    }

    public static boolean isVowelPresent(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }

    //Method to check string is palindrome or not
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Method to check if a number is prime or not
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Method to check if a number is palindrome or not
    public static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder, originalNum;
        originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    //Method to check if a number is Armstrong or not
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;
        for (;originalNum != 0; originalNum /= 10, ++n);
        originalNum = num;
        for (;originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }
        return result == num;
    }

    //Method to check if a number is perfect number or not
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    //Method to check if a number is strong number or not
    public static boolean isStrongNumber(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0) {
            int i = 1, fact = 1;
            remainder = originalNum % 10;
            while (i <= remainder) {
                fact *= i;
                i++;
            }
            result += fact;
            originalNum /= 10;
        }
        return result == num;
    }

    // Method to check time in 24-hour format



}
