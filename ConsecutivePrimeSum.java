import java.util.ArrayList;
import java.util.Arrays;


public class ConsecutivePrimeSum {
	public static void main(String[] args){
		Sieve s = new Sieve(1000000);
		int[] ar = new int[1000001];
		ArrayList<Integer> al= s.getList();
		System.out.println(al.size());
		for (int k = 0; k < al.size(); k++){
			int sum = al.get(k);
			for (int i = k+1; i < al.size(); i++){
					sum+=al.get(i);
					if (sum>=1000000)
						break;
					if (pTest(sum)){
						if ((i-k+1)>ar[sum])
							ar[sum]=(i-k+1);
						//System.out.println(ar[sum] + "; " + sum);
					}
			}
			System.out.println(k);	
		}
		System.out.println(ar[953]);
		int maxValue = 0;
		int maxI = 0;
		for (int k = 0; k < ar.length; k++){
			if (ar[k] > maxValue){
				maxValue = ar[k];
				maxI = k;
				System.out.println(maxI + "; " + maxValue);
			}
		}
		System.out.println(maxI + "; " + maxValue);
	
		
	}
	public static boolean pTest(int n){
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		for (int k = 2; k <= n/2; k++){
			if (n%k==0){
				return false;
			}
		}
		return true;
	}

}
