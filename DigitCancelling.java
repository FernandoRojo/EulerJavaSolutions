import java.util.Stack;


public class DigitCancelling {
	public static void main(String[] args){
		int numi = 1;
		int deni = 1;
		for (int k = 10; k < 100; k++){
			for (int i = k; i <100; i++){
			if (Digits(k, i)){
				//System.out.println(k + "; " + i);
				numi*=k;
				deni*=i;
				System.out.println(numi + "; " + deni);
			}
			}
		}
		System.out.println(numi + "; " + deni);
		for (int k = 2; k <= numi; k++){
			if (numi%k ==0 && deni%k == 0){
				numi/=k;
				deni/=k;
				k = 1;
				System.out.println(numi + "; " + deni);
			}
		}
	}


public static boolean Digits(int n, int b){
	if (n == b) return false;
	double s = n/(double) b;
	String s1 = "" + n;
	String s2 = "" + b;
	
	int shared = 0;
	char[] ar = s1.toCharArray();
	char[] ar2 = s2.toCharArray();
	int share = 0;
	Stack<Integer> num = new Stack<Integer>();
	Stack<Integer> den = new Stack<Integer>();
	for (int c : ar){
		num.add(c-48);
	}
	for (int c : ar2){
		den.add(c-48);
	}
	
	for (int c : num){
		if (den.contains(c)){
			shared++;
			share = c;		
		}
	}
	if (shared == 0||share == 0){
		return false;		
	}
	den.remove(new Integer(share));
	num.remove(new Integer(share));
	double so2;
	try{
	so2 = Double.parseDouble(num.pop()+"")/ Double.parseDouble(den.pop()+"");
	}
	catch(Exception e){
		return false;
	}
	return so2==s;
	
}
}