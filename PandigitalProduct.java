import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PandigitalProduct {
	public static void main(String[] args){
	Set<Integer> al = new HashSet<Integer>();
	for (int k = 1; k < 100; k++){
		for (int i = 1; i < 5000; i++){
			if(isPan(k, i, k*i))
			al.add(k*i);
		}
	}
	int sum = 0;
	System.out.println(al);
	for (int i : al){
		sum += i;
	}
	System.out.println(sum);
	}
	
	public static boolean isPan(int a, int b, int c){
		String s = "";
		s+=a+ "" + b + ""+ c;
		if (s.length()!=9){
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
		al.add(8);
		al.add(9);
		for (int k = 0; k < s.length();k++){
			int i = Integer.parseInt(s.substring(k,k+1));
			if (!al.contains(i))
				return false;
			al.remove(i);
		}
		return true;
		
		
				
	}
}
