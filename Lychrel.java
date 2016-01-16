
public class Lychrel {
	public static void main(String[] args){
		long count = 1;
		long value = 1;
		long fail = 0;
		boolean passed = false;
		while(count < 10000)
		    {
			System.out.println(count);
			value = count;
			long attempts = 0;
			while(!passed||attempts>50){
			value = value + reverse(value);
			if (isPalin(value))
				passed = true;
			attempts++;
		    }
			if (!passed)
				fail++;
			passed = false;
			count++;
			}
		System.out.println(fail);
	}
	public static long reverse(long n){
		String s = n + "";
		String s1 = "";
		for (int i = s.length()-1; i >= 0;i--){
			s1+=s.charAt(i);
		}
		return Long.parseLong(s1);
	}
	public static boolean isPalin(long n){
		String s = n + "";
		for (int i = 0; i < s.length()/2; i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
}
