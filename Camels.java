import java.util.Arrays;


public class Camels {
	public static void main(String[] args){
		int[] answers = new int[11];
		answers[1] = 1;
		answers[2] = 2;
		for (int k = 3; k < 11; k++){
			answers[k]=answers[k-1]+answers[k-2];
		}
		System.out.println(Arrays.toString(answers));
	}
}
