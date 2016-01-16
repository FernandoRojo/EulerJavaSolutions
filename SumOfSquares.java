import java.util.ArrayList;


public class SumOfSquares {

	public static void main(String[] args) {
		Sieve s = new Sieve(150);
		ArrayList<Integer> al = s.getList();
		for(int i = 0; i<al.size();i++){
			if ((al.get(i)%4) != (1)){
				al.remove(i);
				i--;
			}	
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i = 0; i < al.size();i++){
			for(int k = i+1; k<al.size();k++){
				int product = al.get(i)*al.get(k);
				if (!al2.contains(product))
					al2.add(product);
			}
		}
		//al2.sort(null);
		ArrayList<Integer> sq = new ArrayList<Integer>();
		for(int i = 1; i<144;i++){
			sq.add(i*i);
		}
		int sum = 0;
		for(int i : al2){
			for(int k = 0; (k*k) < i; k++){
				if(k>Math.sqrt(i-k*k))
					continue;
				if (sq.contains(i-(k*k))){
					//System.out.println(i + "; " + k + "; "+ Math.sqrt(i-k*k)+ "; " + sum);
					sum+=k;
				}
			}
		}
		System.out.println(al2);
		System.out.println(al2.size());
	}
		
}
