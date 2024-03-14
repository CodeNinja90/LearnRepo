public class CharacterCount {

    public static void main(String[] args) {
        getCharCount();
    }

    private static void getCharCount() {
        String str = "apple";
        char character = 'p';
        int count = 0;

        // Assuming ASCII characters
        int[] charCount = new int[256];

      

        for (int i = 0; i < str.length(); i++) {

            if ( charCount[str.charAt(i)] > 1) {

                break;
            }
                


            charCount[str.charAt(i)]++;
        }

        count = charCount[character];

        System.out.println("Number of occurrences of '" + character + "' in '" + str + "': " + count);
    }
    
}
