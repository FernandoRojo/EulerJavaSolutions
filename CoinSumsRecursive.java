import java.util.Arrays;


public class CoinSumsRecursive {
	static int[] c = {1, 2, 5, 10, 20, 50, 100, 200};
	static int[] cs = new int[201];
	public static void main(String[] args){
		cs[0]=1;
		for(int i : c){
			for (int k = 1; k <201; k++){
				if((k-i)>=0)
					cs[k] = cs[k] + cs[k-i];
			}
		}
		System.out.println(Arrays.toString(cs));
		System.out.println(cs[200]);
	}
}
