import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class PrimeSequence {
	public static void main(String[] args){
		Sieve s = new Sieve(1000000);
		ArrayList<Integer> P = s.getList();
		System.out.println(P.get(1600));
		for (int k = 9600; k < P.size(); k++){
			int c = 0;
			int k1 = P.get(k);
			String S = ""+P.get(k);
			for (int i = k+1; i < P.size(); i++){
			String S1 = ""+P.get(i);
			
			int i1 = P.get(i);
			if (k1-i1<-1000000)
			break;
				//System.out.println(P.get(k)-P.get(i));
			if (Compare(S1,S)!=0){
			//	System.out.println(S+ "; " + S1);
				c++;
			}
			}
			if (c>6)
				break;
		}
		
		System.out.println("done");
	}
	public static int Compare(String s1, String s2){
		int count = 0;
		if(s2.charAt(4)!=s2.charAt(2)||s2.charAt(0)!=s2.charAt(2))
			return 0;
		if(s1.charAt(4)!=s1.charAt(2)||s1.charAt(0)!=s1.charAt(2))
			return 0;
		if(s2.charAt(3)!=s1.charAt(3))
			return 0;
		if(s2.charAt(1)!=s1.charAt(1))
			return 0;
		if(s2.charAt(5)!=s1.charAt(5))
			return 0;
		return 1;
	}
	

	public static void PermTest(int a, int b, int c){
		String a1 = "" + a;
		Stack<Character> cs = new Stack<Character>();
		char[] ch = a1.toCharArray();
		for (char f:ch){
			cs.add(f);
		}
		String a2 = "" + b;
		Stack<Character> cs1 = new Stack<Character>();
		char[] ch1 = a2.toCharArray();
		for (char f:ch1){
			cs1.add(f);
		}
		String a3 = "" + c;
		Stack<Character> cs2 = new Stack<Character>();
		char[] ch2 = a3.toCharArray();
		for (char f:ch2){
			cs2.add(f);
		}
		while(cs.size()>0){
		char check = cs.pop();
		if (cs1.contains(check)&&cs2.contains(check)){
		cs1.remove(new Character(check));
		cs2.remove(new Character(check));
		}
		else
			return;
		}
		System.out.println(a + "" + b + "" + c);
	}
}
