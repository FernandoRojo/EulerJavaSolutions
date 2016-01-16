import java.util.HashSet;
import java.util.Set;


public class Prob {
	public static void main(String[] args){
		int failures = 0;
		Set<String> ss = new HashSet<String>();
		
		for (int k = 0; k < 10000000; k++){
			int trial = 1;
			String s = "";
			boolean fail = false;
			int dollars = 3;
			while (trial <=13){
			double r = Math.random();
			if (r<=.25){
				dollars--;
				s+="L";
			}
			else{
				dollars++;
				s+="W";
			}
			if (dollars == 0)
			{
				fail = true;	
				break;
			}	
			trial++;
		}
			if (fail&&trial==5){
				failures++;
				ss.add(s);
			}
	}	
		System.out.println(ss);
		System.out.println(ss.size());
		System.out.println(failures/10000000.0);
	}
}
