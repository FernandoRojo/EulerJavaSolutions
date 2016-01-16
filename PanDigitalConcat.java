import java.util.HashSet;
import java.util.Set;


public class PanDigitalConcat {
	public static void main(String[] args){
	long pandigital = 0;
		for(int k = 1000000; k < 10000000; k++){
			if (isPan(k)&&pTest(k)){
				pandigital = k;
				System.out.println(k);
			}
		System.out.println(k);
		}
	System.out.println(pandigital);
	}
	public static boolean pTest(int n){
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		for (int k = 2; k <= Math.sqrt(n); k++){
			if (n%k==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isPan(int p){
		String s = "" + p;
		if (s.length()!=7){
			return false;
		}
		Set<Integer> al = new HashSet<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		//al.add(8);
		//al.add(9);
		for (int k = 0; k < s.length();k++){
			int i = Integer.parseInt(s.substring(k,k+1));
			if (!al.contains(i))
				return false;
			al.remove(i);
		}
		return true;
		
		
				
	}
}
