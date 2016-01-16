import java.util.Arrays;


public class IntegerRightTriangles {
	public static void main(String[] args){
		int[] solutions = new int[10001];
		for (int k = 1; k < 500; k++){
			for (int i = k; i <500; i++){
				for (int j = 1; j < 500; j++){
					if(k+i+j>1000){
						break;}
						if (i*i+k*k==j*j)
							solutions[k+i+j]++;
				}
			}	
		}
	int maxIndex = 1;
	int maxValue = 0;
	for (int k = 0; k < 1001;k++){
		if (solutions[k]>maxValue){
			maxIndex = k;
			maxValue = solutions[k];
			}
	}
	System.out.println(maxIndex);
	}

}
