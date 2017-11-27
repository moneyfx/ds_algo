import java.util.*;

public class SelfDividingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumberDetectByString(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
    
    public static boolean isSelfDividingNumberDetectByString(int number) {
        String str = String.valueOf(number);
        int currentDigit;
        for (int i = 0;  i < str.length(); i++) {
            currentDigit = Character.getNumericValue(str.charAt(i));
            if (currentDigit == 0) {return false;}
            if (number % currentDigit != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        List<Integer> result = selfDividingNumbers(1, 22);
        System.out.println(result);
    }
}