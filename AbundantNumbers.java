import java.util.ArrayList;


public class AbundantNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> abundant = new ArrayList<Integer>();
		int total = 0;
		for (int k = 0; k < 28123;k++)
		{
			if (d(k)>k)
				abundant.add(k);
		}
		boolean[] abundant2 = new boolean[28123];
		for (int k = 0; k < abundant.size();k++)
		{
			for (int i = k; i < abundant.size()&&abundant.get(k)+abundant.get(i)<28123;i++)
				abundant2[(abundant.get(k)+abundant.get(i))] = true;
		}
		for (int k = 0; k < 28123;k++)
		{
			if (!abundant2[k])
			{total+=k;}
		}
		System.out.println(total);

	}
	public static int d(int n){	
		int f = 0;
		for (int i = 1; i<=n/2;i++){
				if (n%i==0)
					f+=i;
			}
	    return f;
		}

}
