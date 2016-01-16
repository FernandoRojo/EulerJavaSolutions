import java.util.Arrays;


public class Diophantine {
	public static void main(String[] args){
		long[] values = new long[1000];
		long max = 0;
		long MaxIndex = 0;
		for (long k = 1; k < 1000;k++){
			boolean solved = false;
			long x = 1;
			long y = 1;
			while(!solved){
			System.out.println(k);
			if (k==x*x){
				solved = true;
				x = 0;
			}
			long solve =x*x-k*(y*y);
			System.out.println(x*x+ "-" + k +"*"+ y*y + "=" +solve);
			while(solve>0){
				if (x>max){
					max = x+1;
					MaxIndex = k;
					solved = true;
					break;
				}
				else y++;
				solve = x*x-k*(y*y);
			}
			x++;
			}
		}
		System.out.println(MaxIndex);
		System.out.println(Arrays.toString(values));
	}

}
