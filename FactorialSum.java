import java.util.Arrays;


public class FactorialSum {
	
	public static void main(String[] args){
		long[] f = new long[10];
		int total = 0;
		for (int k = 0; k < 10; k++){
			long value = k;
			f[k] = fact(value);
		}
		f[0]=0;
		System.out.println(Arrays.toString(f));
		for (int k = 3; k < 1000000; k++){
		long value = k;
		String s = "" + k;
		int l = 0;
			while (l<s.length()){
			long fact = f[digitAt(k, l)];
			value = value-fact;
			//System.out.println(k+ " " +value);
			if (value<0)
				break;
			l++;
			}
		if (value==0){
			total += k;
		System.out.println(total);}
		}
	System.out.println(total);
	}
	public static long fact(long n)
	{
		return n*n*n*n*n;
	}
	public static int digitAt(int n, int d){
		String s = "" + n;
		s = s.substring(d, d+1);
		return Integer.parseInt(s);
	}

}
