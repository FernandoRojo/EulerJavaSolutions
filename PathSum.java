import java.io.*;
import java.util.*;

public class PathSum {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C:/Users/Fernando/Downloads/EulerProject/p067_triangle.txt"));
		int[][] ia = new int[100][100];
		place[][] pa = new place[100][100];
		for (int k = 0; k < 100; k++){
			for (int i = 0; i<=k;i++){
				ia[k][i] = in.nextInt();
				pa[k][i] = new place(ia[k][i]);
			}		
		}
		in.close();
		pa[0][0].setMax(0);
		for(int k = 1;k<100;k++){
			for (int i = 0; i <= k; i++){
				if (i == 0){
					pa[k][i].setMax(pa[k-1][i].getMax());
				}
				else if (i==k){
					pa[k][i].setMax(pa[k-1][i-1].getMax());
				}
				else{
					pa[k][i].setMax(Math.max(pa[k-1][i-1].getMax(), pa[k-1][i].getMax()));
				}
			}
		}
		int max = 0;
		for (int k = 0; k < 100; k++){
			max = Math.max(max, pa[99][k].getMax());
		}
		System.out.println(max);
		

	}

}
class place {
	int maxSum;
	int value;
	public place(int value){
		this.value = value;
	}
	public void setMax(int M){
		this.maxSum = value+M;
	}
	public int getMax(){
		return maxSum;
	}
	public String toString(){
		return this.maxSum + " ";
	}
}
