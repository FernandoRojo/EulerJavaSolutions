
public class Digits {
	public static void main(String[] args){
		int k = 2;
		int place = 1; 
		int value = 1;
		while (place < 1000000){
		place+=Integer.toString(k).length();
		if (place>=999995){
		System.out.println((place - Integer.toString(k).length()+1)+"; " + (k));
		}
		k++;
		}
	}
}
