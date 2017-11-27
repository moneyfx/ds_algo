/*
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/
public class HammingDistance {

    public static int getHammingDistance(int x, int y) {
    	int resultOfXor = x ^ y;
    	
        return Integer.bitCount(resultOfXor);
    }

    public static void main(String[] args) {
    	int x = 1;
    	int y = 4;

    	System.out.println(getHammingDistance(x, y));
    }
}
