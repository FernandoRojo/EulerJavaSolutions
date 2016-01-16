import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RecurringCycle {
	public static void main(String[] args)
	{
	int max = 0;
	for (int k = 1; k <1000; k++)
		if (rec(k)>max)
		    max = k;
	System.out.println(max);
	
	}
	public static int rec(int n){
		int k = 1;
		int r = 0;
		int count = 0;
	
		Map<Integer, ArrayList<Integer>> m = new HashMap<Integer, ArrayList<Integer>>();
		while (true)
		{ while (k/n==0)
			k = k*10;
			//System.out.println(k);
		  if (k%n == 0)
			 break;
		  else{
			  r = k/n;
			  k = k%n;	 
		 // System.out.println(r+ " " +k);
		  if (!m.containsKey(r))
		  {m.put(r, new ArrayList<Integer>());
		  m.get(r).add(k);
		  }
		  else if (m.containsKey(r)){
			  if(m.get(r).contains(k)){
				  for (int i = 1; i<10;i++){
				    if(m.containsKey(i))
					  count+=m.get(i).size();}
				  return count;
			  }
			  else{m.get(r).add(k); count++;}
		  }
		  
		  }
		}
		return -1;
	
	}
	
}
