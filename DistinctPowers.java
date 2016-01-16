import java.math.BigInteger;
import java.util.Arrays;


public class DistinctPowers {

	public static void main(String[] args) {
	BigInteger[] ar = new BigInteger[99*99];
	int counter = 0;
	for (int a = 2; a <101; a++){
		for (int b = 2; b<101;b++){
			BigInteger c = new BigInteger(""+a);
			c = c.pow(b);
			ar[counter] = c;
			counter++;
		}
	}
	Arrays.sort(ar);
	BigInteger prevValue = new BigInteger("-1");
	counter = 0;
	for (int k = 0; k<ar.length; k++){
		BigInteger value = ar[k];
		if (value.equals(prevValue)){
			continue;
		}
			
		counter++;
		prevValue = ar[k];
	}
		
		
	System.out.println(counter);


	}

}
