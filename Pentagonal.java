import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Pentagonal {
	public static void main(String[] args){
		ArrayList<Long> seT = new ArrayList<Long>();
		ArrayList<Long> seP = new ArrayList<Long>();
		ArrayList<Long> seH = new ArrayList<Long>();
		long i = 1;
		System.out.println("hweqi");
		while(i < 300000){
			//seT.add(i*(i+1)/2);
			seP.add(i*(3*i-1)/2);
			seH.add(i*(2*i-1));
			i++;
	}
		for (int k = 0; k < seT.size(); k++){
			long s = seP.get(k);
			if (seH.contains(s))
				System.out.println(s);
		}
	
	}
	
}
