import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class CircularPrimes {
	static boolean[] ba = new boolean[1000000];
	public static void main(String[] args){
		boolean b = false;
		Arrays.fill(ba, false);
		Set<Integer> al = new HashSet<Integer>();
		for (int i = 2; i < 1000000; i++)
		{
			if(pTest(i))
				b = rotate(i);
			if (b){
				ba[i]= true;
				b = false;
		}
			System.out.println(i);
		}
		int counter = 0;
		
	ba[2] = true;
	ba[5] = true;
	for (int k = 0; k < 1000000; k++){
		if (ba[k]){
			counter++;
			System.out.println("value: " + k);
		}
	}	
	
	System.out.println(counter);
	}
	public static boolean pTest(int n){
		for (int k = 2; k <= n/2; k++){
			if (n%k==0){
				return false;
			}
		}
		return true;
	}
	public static boolean rotate(int n){
		String s = "" + n;
		char[] ar = s.toCharArray();
		Stack<Character> s2 = new Stack<Character>();
		for (char c : ar){
			if (c == '0' || c == '2' || c == '4' ||c  == '6' || c == '8' || c == '5')
				return false;
			s2.add(c);
		}
		for (int i = s.length()-1; i > 0; i--){
			s = "";
			char r = s2.remove(0);
			s2.add(r);
			for (char c : s2){
				s += c;
			}
			int p = Integer.parseInt(s);
			if(!pTest(p))
				return false;	
		}
		return true;
		
	}
}
	

