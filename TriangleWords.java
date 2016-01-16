import java.io.*;
import java.util.*;
public class TriangleWords {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("D:/p042_words.txt"));
		String s = in.nextLine();
		String[] a = s.split("\",\"");
		a[0] = "A";
		a[a.length-1] = "YOUTH";
		int count = 0;
		Set<Integer> se = new HashSet<Integer>();
		int tri = 0;
		int i = 1;
		while(i < 100){
			tri += i;
			se.add(tri);
			i++;
	}
		System.out.println(se);
		for (String c:a){
			int value = 0;
			for (int k = 0; k < c.length();k++){
				value += (int) c.charAt(k)-64; 
				System.out.print(value + ";");
			}
		if (se.contains(value))
			count++;
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println(count);
		in.close();
	}

}
