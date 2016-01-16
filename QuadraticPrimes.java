import java.util.ArrayList;


public class QuadraticPrimes {
	public static void main(String[] args){
	int max = 0;
	int maxA = 0;
	int maxB = 0;

	
	int primeCounter = 0;
	int n = 0;
	for (int k = -1000; k<=1000;k++){
		for (int i = 0; i <= 1000; i++){
			while(pTest(quadratic(n, k, i))){
				n++;
				primeCounter++;
			}
			if (primeCounter>max){
				max = primeCounter;
				maxA = k;
				maxB = i; }
			n = 0;
			primeCounter = 0;
			}
		}
	System.out.println(max + " " + maxA + " " + maxB);
	}
	public static boolean pTest(int n){
		for (int k = 2; k < Math.abs(n/2); k++){
			if (n%k==0){
				return false;
			}
		}
		return true;
	}
	public static int quadratic(int n, int b, int c){
		return (n*n+(b*n)+c);
	}
	public static int d(int n){	
		int f = 0;
		for (int i = 1; i<=n/2;i++){
				if (n%i==0)
					f+=i;
			}
	    return f;
		}
	

}
