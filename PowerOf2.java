import java.math.BigInteger;
import java.util.*;
public class PowerOf2 {
	static int[] ar = new int[500];
	public static void main(String[] args){
	ar[0] = 1;
	for (int k = 0; k<1000;k++)
	doublevalue();
	int sum = 0;
	for(int k = 0; k<500; k++)
	sum+= ar[k];
	System.out.println(sum);
	BigInteger b = new BigInteger("2");
	b = b.pow(1000);
	System.out.println(b);
	}
	
	
	public static void doublevalue(){
		int[] temp = new int[500];
		temp = Arrays.copyOf(ar, 500);
		for(int k = 0; k <500;k++){
		ar[k]+=temp[k];
		if (ar[k]>9){
			temp[k+1] += ar[k]/10;
			ar[k] = ar[k]%10;
		}
		}
	}
	

}
