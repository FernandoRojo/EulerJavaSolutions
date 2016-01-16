import java.util.*;
import java.io.*;

public class LargeSum {

	public static void main(String[] args) throws FileNotFoundException{
		long st = System.nanoTime();
		Scanner input = new Scanner(new File("C:/Users/Fernando/Downloads/EulerProject/LargeSum.txt"));
		String[] sa = new String[100];
		for (int k = 0; k<100; k++)
			sa[k] = input.nextLine();
		int[][] ia = new int[100][50];
		for (int k = 0; k<100;k++){
			for (int i = 0; i<50; i++){
				ia[k][i] = sa[k].charAt(i)-48;
			}
		}
		int[] answer = new int[55];
		int danswer = 0;
		for (int k = 49; k>=0; k--)
		{
			for (int i = 0; i<100; i++){
				
				danswer += ia[i][k];
				//System.out.println(danswer);
			}
			answer[k+3] += danswer%10;
			danswer = (danswer/10);
			answer[k+2] += danswer%10;
			danswer = danswer/10;
			answer[k+1] += danswer%10;
			danswer = 0;
			for (int j = 0; j<53;j++){
				if(answer[j]>9)
				{
			    answer[j-1] += answer[j]/10;
				answer[j] = answer[j]%10;
				j--;
				}
			}
		}
		for (int j = 1; j<53;j++){
			System.out.print(answer[j]);
		}
		System.out.println();
		long et = System.nanoTime();
		System.out.println(et-st);
		
		
			
	}
		

	

}
