public class fleas {
	static double[][] TotalMatrix = new double[32][32];
	static double[][] currentFlea = new double[32][32];
	static double[][] currentFleaTemp2 = new double[32][32];
	public static void main(String[] args){
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				TotalMatrix[k][i] = 1;
			}
		}
		for(int a = 1; a<31;a++){
			for (int b = 1; b<31;b++){
				currentFlea = new double[32][32];
				for (int k = 1; k < 31; k ++){
					for (int i = 1; i < 31; i++){
						currentFlea[k][i] = 1;
					}
				}
				currentFlea[a][b]=0;
				for(int k = 0; k < 50; k++){
					move();
				}
				combine();
			}
		}
		printb(TotalMatrix);
	}

	public static void combine(){
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				TotalMatrix[k][i] *= currentFlea[k][i];
			}
		}
	}
	public static void move(){
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				currentFleaTemp2[k][i] = 0;
			}
		}
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				change(k,i);
			}
		}
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				currentFlea[k][i] -= currentFleaTemp2[k][i];
			}
		}
	}

	public static void change(int a, int b){
		double place = currentFlea[a][b];
		if(place==1)
			return;
		int count = 0;
		if (TotalMatrix[a-1][b]==0)
			count++;
		if (TotalMatrix[a+1][b]==0)
			count++;
		if (TotalMatrix[a][b+1]==0)
			count++;
		if (TotalMatrix[a][b-1]==0)
			count++;
		double p = 1/(4.0-count);
		currentFleaTemp2[a+1][b] += (1-place)*p;
		currentFleaTemp2[a-1][b] += (1-place)*p;
		currentFleaTemp2[a][b+1] += (1-place)*p;
		currentFleaTemp2[a][b-1] += (1-place)*p;
		currentFlea[a][b] = 1;
	}
	public static void printb(double[][] a){
		double tot = 0;
		for (int k = 1; k < 31; k ++){
			for (int i = 1; i < 31; i++){
				double temp = a[k][i];
				tot+=temp;
			}
		}
		System.out.println(tot);
	}


}