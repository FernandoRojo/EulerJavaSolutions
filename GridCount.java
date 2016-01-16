
public class GridCount {

	public static void main(String[] args) {
		long count = Grid(20, 0, 0);
		System.out.println(count);

	}
	public static long Grid(int n, int r, int c){
		long count = 0;
		if (c==n || r==n){
			return 1;}
		else{
			count += Grid(n, r+1, c);
			count += Grid(n, r, c+1);
		}
		return count;
	}

}
