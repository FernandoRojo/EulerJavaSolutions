import java.util.ArrayList;
import java.util.Arrays;


public class PrimeGroups {
	static ArrayList<Integer> check;
	static int b;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args){
		Sieve s = new Sieve(10000);
		ArrayList<Integer> a = s.getList();
		Sieve s2 = new Sieve(1000000);
		
		check = s2.getList();
		//System.out.println(a.toString());
		int l = a.size();
		for (int k = 1; k < l-5; k++){
			for (int i = k+1; i<l-4;i++){			
				for (int j = i+1; j < l-3; j++){	
					for (int t = j+1; t<l-2;t++){
						for(int y = t+1; y<l-1;y++){
							int fir = a.get(k);
							int sec = a.get(i);
							int thi = a.get(j);
							int fou = a.get(t);
							int fif = a.get(y);
							int sum = fir+sec+thi+fou+fif;
							if (sum > min){
								break;
							}
							if (test(new int[] {fir, sec, thi,fou, fif})){
								System.out.println(fir + " " + sec + " " + thi + " " + fou);	
								min = sum;
								System.out.println(min);
							}
							else {
								if (b==0){
									i++;
									j= i+1;
									t = j+1;
									y = t+1;
								}
								if (b==2){
									t++;
									y = t+1;
								}
								if (b==1){
									j++;
									t = j+1;
									y = t+1;
								}
							}
							//System.out.println(fir + " " + sec + " " + thi + " " + fou + " " + fif);	
						}
						
					}
					
				}
			}
			System.out.println(k);
		}
		System.out.println(min);
	}
	public static boolean test(int[] ia){
		int pair = 0;
		for(int k = 0; k < ia.length;k++){
			for(int i = k+1; i<ia.length;i++){
				String s = ia[k] + "" + ia[i];
				String s2 = ia[i] + "" + ia[k];
				if (!pTest(new Integer(s))||!pTest(new Integer(s2))){
					//System.out.println(s + " " + s2 + " " + pair + Arrays.toString(ia));
				    b = pair;
					return false;
				}
			    pair++;
			}
		}
		return true;
	}
	
	public static boolean pTest(int n){
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		for (int k = 2; k <= Math.ceil(Math.sqrt(n)); k++){
			if (n%k==0){
				return false;
			}
		}
		return true;
	}
	
}
