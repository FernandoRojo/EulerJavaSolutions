import java.math.BigInteger;


public class LexicographicPermutation {

	public static void main(String[] args) {
		BigInteger n = new BigInteger("1");
		BigInteger m = new BigInteger("1");
		BigInteger t;
		int count = 2;
		while (n.toString().length()<1000){
			count++;
			t = new BigInteger(n.toString());
			n = n.add(m);
			m = new BigInteger(t.toString());
		}
		System.out.println(count);

	}

}
