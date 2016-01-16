import java.util.ArrayList;
import java.util.Arrays;


public class Sieve {
	public static int SIZE;;
	public Sieve(int n){
		SIZE = n;
	}
	public ArrayList<Integer> getList(){
		boolean[] pr = new boolean[SIZE];
		Arrays.fill(pr,  true);
		pr[0] = false;
		pr[1] = false;
		ArrayList<Integer> P = new ArrayList<Integer>();
		for(int k = 2;k < SIZE; k++){
			if(pr[k]){
				P.add(k);
				int i = 2;
				while(k*i<SIZE){
					pr[k*i]=false;
					i++;
				}
			}
		}
		return P;
	}
}
