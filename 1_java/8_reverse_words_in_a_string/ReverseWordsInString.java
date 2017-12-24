class ReverseWordsInString {
    public static void main(String[] args) {
        String wordsToReverse = "Let's take LeetCode contest";
        System.out.println("original: " + wordsToReverse);
        String result = reverseWords(wordsToReverse);
        System.out.println("reversed: " + result);
    }

    public static String reverseWords(String s) {
        String[] splitted = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i =0; i < splitted.length; i++) {
            sb.append(reverse(splitted[i]) + " ");
        }
        
        return sb.toString().trim();
    }
    
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}