/*
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
*/
public class UnaryBitwiseComplement {

	public static void main(String[] args) {
        int number = 0;
        printBinaryString(number);//00000000000000000000000000000000
        number = ~ number;
        printBinaryString(number);//11111111111111111111111111111111
    }

    public static void printBinaryString(int n) {
        System.out.println(Integer.toBinaryString(n));
    }
}
