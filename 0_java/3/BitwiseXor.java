/*
Bitwise XOR is a binary operator (operates on two operands). 
It's denoted by ^.
The ^ operator compares corresponding bits of two operands. 
If corresponding bits are different, it gives 1. 
If corresponding bits are same, it gives 0.
*/
public class BitwiseXor {

    public static void main(String[] args) {
    	int x = 1;
    	int y = 4;
    	int z = x ^ y;

    	System.out.println(Integer.toBinaryString(x));
    	System.out.println(Integer.toBinaryString(y));
    	System.out.println(Integer.toBinaryString(z));

    	System.out.println(z);    
    }
}
