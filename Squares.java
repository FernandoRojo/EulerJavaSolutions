import java.math.BigInteger;


public class Squares {
	public static void main(String[] args){
		BigInteger b = new BigInteger("1004000000");
		System.err.println("hello");
		while (b.pow(2).compareTo(new BigInteger("1220000000000000000"))<0){
		//	System.out.println(b.pow(2));
			b = b.add(BigInteger.ONE);
		}
		System.out.println(b);
	}
}
