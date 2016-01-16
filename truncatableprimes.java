import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class truncatableprimes {
	static boolean[] ba = new boolean[1000000];
	public static void main(String[] args){
		boolean b = false;
		Set<Integer> al = new HashSet<Integer>();
		int amount = 0;
		int sum = 0;
		int i = 10;
		while(amount < 11)
		{
			if(pTest(i))
				b = truncate(i);
			if (b){
				amount++;
				sum+=i;
				al.add(i);
				b = false;
				System.out.println(i);
		}
		i++;
		System.out.println(i);
		}
		System.out.println(al);
		System.out.println(sum);
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
	public static boolean truncate(int n){
		int n1 = n;
		int n2 = n;
		int ten = (int) Math.log10((double) n);
		
		for (int i = ten; i > 0; i--){
			ten = (int) Math.pow(10, i);
			n1 = n%ten;
			n2 = n2/10;
			if(!pTest(n1)||!pTest(n2))
				return false;	
		}
		return true;
		
	}
}
	