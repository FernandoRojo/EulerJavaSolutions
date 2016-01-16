import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class NamesPoints {
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(new File("D:/2014-2015-Wash-U/Lab Lectures/p022_names.txt"));
		String s = in.next();
		s = s.replaceAll("\"", "");
		String[] sa = s.split(",");
		Arrays.sort(sa);
		long total = 0;
		System.out.println(Arrays.toString(sa));
		for (int k = 0; k<sa.length;k++){
			String name = sa[k];
			int points = 0;
			for (int i = 0; i<name.length();i++){
				points += (int)name.charAt(i)-64;
			}
			points = points*(k+1);
			total+=points;
		}
		System.out.println(total);
	}

}
