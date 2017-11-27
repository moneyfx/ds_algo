/*
https://leetcode.com/problems/self-dividing-numbers/description/

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number 
because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible 
self dividing number, including the bounds if possible. 
*/
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