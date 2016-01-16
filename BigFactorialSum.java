import java.math.BigInteger;


public class BigFactorialSum {
	public static void main(String[] args){
		BigInteger bi = new BigInteger("100");
		System.out.println(bi);
		for (int k = 99; k > 0; k--){
			bi = bi.multiply(new BigInteger("" + k));
		}
		System.out.println(bi);
		int sum = 0;
		for (int k = 0; k <bi.toString().length() ; k++){
			sum += (int) bi.toString().charAt(k)-48;
		}
		System.out.println(sum);
	}

}
