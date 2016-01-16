import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PandigitalTruncates {
	public static void main(String[] args){
		
		ArrayList<Integer> sevens = new ArrayList<Integer>();
		for (int k = 100; k < 1000;k++){
			if (k%7==0&&Integer.toString(k).charAt(1)=='5')
				sevens.add(k);
		}
		sevens.remove(12);
		sevens.remove(6);
		sevens.remove(5);
		sevens.remove(1);
		//sevens.remove(0);
		sevens.add(0,56);
		
		System.out.println(sevens);
		ArrayList<Integer> elevens = new ArrayList<Integer>();
		for (int k = 10; k < 1000;k++){
			if (k%17==0)
				elevens.add(k);
		}
		System.out.println(elevens);
		
		ArrayList<Integer> sofar = new ArrayList<Integer>();
	}
	
	
		
	
	public static boolean isPan(int p){
		String s = "" + p;
		if (s.length()!=10){
			return false;
		}
		Set<Integer> al = new HashSet<Integer>();
		al.add(0);
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
