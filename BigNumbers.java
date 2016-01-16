import java.math.BigInteger;


public class BigNumbers {

	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for(int k = 2; k < 1001; k++){
		BigInteger i = new BigInteger(""+k);
		i = i.pow(k);
		b = b.add(i);
		}
		b = b.mod(new BigInteger("10000000000"));
		System.out.println(b);
	}

}
