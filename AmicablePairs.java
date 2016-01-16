import java.util.Arrays;


public class AmicablePairs {
	public static void main(String[] args)
	{
		int sum = 0;
		for(int k = 1; k<10000;k++){
			int b = d(k);
			if (b == k)
				continue;
			if (b == d(k) && k == d(b))
			{
				sum+=k;
			}
		}
		System.out.println(sum);	

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

