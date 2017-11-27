public class Palindrome {

    public static boolean isPalindrome(String word) {
        int wordLength = word.length();
        char char1;
        char char2;

        for (int i = 0; i < (wordLength / 2); i++) {
            char1 = word.charAt(i);
            char2 = word.charAt(wordLength - i - 1);
            if (Character.toLowerCase(char1) != Character.toLowerCase(char2)) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
