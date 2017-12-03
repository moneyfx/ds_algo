/*
https://leetcode.com/problems/number-complement/description/
Given a positive integer, output its complement number. 
The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Input: 5
Output: 2
Explanation: 
The binary representation of 5 is 101 (no leading zero bits), 
and its complement is 010. 
So you need to output 2.
*/
public class NumberComplement {
    public static int findComplement(int num) {
        int mask = ~0;
        
        int copy = num;
        while (copy != 0) {
            copy = copy >>> 1;
            mask = mask << 1;
        }
        
        return ~num & ~mask;
    }

    public static void main(String[] args) {
        int input = 5;
        int output = findComplement(input);
        System.out.println(output);
        System.out.println(Integer.toBinaryString(input));
        System.out.println(Integer.toBinaryString(output));
    }
}
