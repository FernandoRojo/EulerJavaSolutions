import java.util.ArrayList;


public class DistinctPrimeFactors {
	static ArrayList<Integer> p;
	public static void main(String[] args){
		boolean solved = false;
		int size = 200000;
		int con = 4;
		int seq = 1;
		int Index = 1;
		
		while (!solved){
			Sieve s = new Sieve(size);
			p = s.getList();
			for(int k = 4; k < size; k++){
				Index = k;
				if (p.contains(k))
					continue;
				ArrayList f = PrimeFactors(k);
				if (f.size()!=con)
					continue;
				int i = 1;
				while(true){
					if (unique(f,PrimeFactors(k+i), con)){
						i++;
						seq++;
					}
					else{
						break;
					}
				}
			if (seq == con){
				solved = true;
				break;
				}
			seq = 1;
			System.out.println(k);
			}
			size = size*10;
		}
		System.out.println(Index);
		System.out.println("done");
	}
	public static ArrayList<Integer> PrimeFactors(int n){
		int orig = n;
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		int i = 0;
		while (!p.contains(n)){
			int z = p.get(i);
			if (n%z==0){
				p1.add(z);
				n = n/z;
				i = -1;
			}
		i++;
		}
		p1.add(n);
		p1 = reduce(p1);

		return p1;
	}
	public static ArrayList<Integer> reduce(ArrayList<Integer> a){
		ArrayList<Integer> p1 = a;
		int i = 0;
		while(i < p1.size()){
			int curr = p1.get(i);
			int replaceWith = curr;
			int found = 1;
			//p1.remove(i);
			while(found+i<p1.size()&&p1.get(found+i)==curr){
				replaceWith*=curr;
				found++;
			}
			while(p1.contains(curr))
				p1.remove(new Integer(curr));
			p1.add(i, replaceWith);
			i++;
		}
		return p1;
	}
	public static boolean unique(ArrayList<Integer> a, ArrayList<Integer> b, int s){
		if (a.size()!=s||b.size()!=s)
			return false;
		return true;
	}
}
