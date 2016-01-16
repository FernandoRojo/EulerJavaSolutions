
public class DivisibleTriangularNumber {
	
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();
		long tnumber = 1;
		long count = 2;
		while (true)
		{
			int f = 0;
			
			
			f = factors(tnumber);
			
			if(f>500){
				break;
			}
			tnumber+=count;
			count++;
			
		}
		System.out.println(tnumber);
		long endtime = System.currentTimeMillis();
		long time = endtime-starttime;
		System.out.println(time);
	}
	public static int factors(long n){
		int prime = 1;
		int count = 1;
		double limit = Math.sqrt(n);
		for (int k = 1; k < limit;k++)
		{
			if (n%k == 0)
				count+=2;
		}
		return count;
	}

}
