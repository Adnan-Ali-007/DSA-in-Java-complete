import java.math.BigInteger;
import java.util.Random;
//elgamalencryption
public class labis{

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO))
            return a;
        else
            return gcd(b, a.mod(b));
    }

    private static BigInteger genKey(BigInteger q) {
        Random random = new Random();
        BigInteger key = new BigInteger(q.bitLength(), random);
        while (gcd(q, key).compareTo(BigInteger.ONE) != 0) {
            key = new BigInteger(q.bitLength(), random);
        }
        return key;
    }

    private static BigInteger power(BigInteger a, BigInteger b, BigInteger c) {
        BigInteger x = BigInteger.ONE;
        BigInteger y = a;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.testBit(0)) {
                x = x.multiply(y).mod(c);
            }
            y = y.multiply(y).mod(c);
            b = b.divide(BigInteger.valueOf(2));
        }
        return x.mod(c);
    }

    private static BigInteger[] encrypt(String msg, BigInteger q, BigInteger h, BigInteger g) {
        BigInteger[] enMsg = new BigInteger[msg.length()];
        BigInteger k = genKey(q); // Private key for sender
        BigInteger s = power(h, k, q);
        BigInteger p = power(g, k, q);

        System.out.println("g^k used : " + p);
        System.out.println("g^ak used : " + s);

        for (int i = 0; i < msg.length(); i++) {
            enMsg[i] = s.multiply(BigInteger.valueOf((int) msg.charAt(i))).mod(q);
        }

        return new BigInteger[]{p, k};
    }

    private static String decrypt(BigInteger[] enMsg, BigInteger p, BigInteger key, BigInteger q) {
        StringBuilder drMsg = new StringBuilder();
        BigInteger h = power(p, key, q);

        for (BigInteger bi : enMsg) {
            drMsg.append((char) bi.multiply(h.modInverse(q)).intValue());
        }

        return drMsg.toString();
    }

    public static void main(String[] args) {
        String msg = "encryption";
        System.out.println("Original Message: " + msg);

        BigInteger q = new BigInteger(50, new Random());
        BigInteger g = new BigInteger(q.bitLength(), new Random());

        BigInteger key = genKey(q); // Private key for receiver
        BigInteger h = power(g, key, q);

        System.out.println("g used : " + g);
        System.out.println("g^a used : " + h);

        BigInteger[] enMsgAndP = encrypt(msg, q, h, g);
        BigInteger p = enMsgAndP[0];
        key = enMsgAndP[1];

        String drMsg = decrypt(enMsgAndP, p, key, q);
        System.out.println("Decrypted Message: " + drMsg);
    }
}
