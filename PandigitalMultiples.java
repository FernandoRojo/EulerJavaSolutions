import java.util.Arrays;
import java.util.Stack;


public class PandigitalMultiples {
	public static void main(String[] args){
		long st = System.currentTimeMillis();
		for (int k = 1;k<167000;k++){
			if (PermTest(k,2)){
				System.out.println(k);
				break;
			}
		}
		System.out.println(System.currentTimeMillis()-st);
	}
	public static boolean PermTest(int a, int m){
		if (m==7)
			return true;
		String a1 = ""+(m*a);
		String check1 = ""+a;
		char[] ch = a1.toCharArray();
		char[] ch1 = check1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for (int k = 0; k < ch.length; k++){
			if (ch[k]!=ch1[k])
				return false;
		}
		return PermTest(a, m+1);
	}
}

