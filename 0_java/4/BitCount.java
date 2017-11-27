public class BitCount {
    
    public static void main(String[] args) {
    	int x = 115;
    	String binaryStr = Integer.toBinaryString(x);//1110011
    	int bitCount = Integer.bitCount(x);//5
    	int bitCount2 = getBitCount(x);

    	System.out.println(binaryStr);//1110011	
    	System.out.println(bitCount);//5
    	System.out.println(bitCount2);//5
    }

    public static int getBitCount(int x) {
    	int count = 0;

    	while (x != 0) {
    		if ((x & 1) == 1) {
    			count++;
    		}

    		x = x >>> 1;
    	}

    	return count;
    }
}
