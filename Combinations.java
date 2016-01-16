import java.math.BigInteger;


public class Combinations {
	public static void main(String[] args){
		int count = 0;
		for(int k = 23; k < 101;k++){
			for (int i = 1; i<k/2+1; i++){
			BigInteger n = new BigInteger(""+ k); 
			BigInteger r = new BigInteger(""+ i); 
			BigInteger nr = n.subtract(r);
			n = fact(n);
			r = fact(r);
			nr = fact(nr);	
			BigInteger res = n.divide(r.multiply(nr));
			//System.out.println(res);
			if (res.compareTo(new BigInteger("1000000"))==1)
					count+=2;
			}
			if(k%2!=0){
				count-=1;
			}
			}
		System.out.println(count);
	}
	public static BigInteger fact(BigInteger i){
		if(i.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else return i.multiply(fact(i.subtract(BigInteger.ONE)));
	}
}

