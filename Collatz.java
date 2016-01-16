
public class Collatz {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		long max = 1;
		long count = 0;
		long index = 0;
		for (long k = 2; k<=1000000;k++){
			count = 0;
			long n = k;
			while (n>1)
			{
				if (n%2==0){
					n=n/2;
					count++;
				}
				else{
					n=3*n+1;
					count++;
				}
			}
			if (count>max)
			{
				max = count;
				index = k;
			}

		}
		System.out.println(index);
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime);
	}
	

}
