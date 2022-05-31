package Item1;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bi;

        int bitLength = 3;

        Random rnd = new Random();

        bi = BigInteger.probablePrime(bitLength, rnd);

        BigInteger bi2;
        int bitLength2 = 3;

        bi2 = new BigInteger(bitLength, 3, rnd);

        System.out.println("bi = " + bi);
        System.out.println("Integer.toBinaryString(bi.byteValue()) = " + Integer.toBinaryString(bi.byteValue()));
        System.out.println("===================================");
        System.out.println("bi2 = " + bi2);
        System.out.println("Integer.toBinaryString(bi2.byteValue()) = " + Integer.toBinaryString(bi2.byteValue()));
    }
}
