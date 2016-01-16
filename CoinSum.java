import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class CoinSum {

	private static ArrayList<Integer> AL = new ArrayList<Integer>();
	private static ArrayList<Integer> coins = new ArrayList<Integer>();
	
	private static int total = 200;
	
	public static void main(String[] args) {
	int counter = 11;
	coins.add(200);
	coins.add(100);
	coins.add(50);
	coins.add(20);
	coins.add(10);
	coins.add(5);
	coins.add(2);
	coins.add(1);
	
	AL.add(coins.get(0));
	while(AL.get(0)!=1){
		if(Sum(AL)==total){
			counter++;
			System.out.println(AL);
		}
		reset();
	}
	System.out.println(counter);
	}
	public static void reset(){
	
	int k = AL.size()-1;
	int ones = 0;
	while (AL.get(k)==1){
		ones++;
		k--;
	}
	int value = AL.get(k);
	ones+=value;
	int replaceWith = coins.get(coins.indexOf(value)+1);
	System.out.println(AL);	
	AL.remove(k);
	for (int i = k; i<k+(ones/replaceWith); i++){
		AL.add(k, replaceWith);	
	}

	int L = AL.size()-1;
	while(Sum(AL)>total){
		AL.remove(L);
		L--;
	
	}
	int place = coins.indexOf(value)+1;
	while(Sum(AL)!=total){
		while(Sum(AL)>total){
		AL.remove(AL.size()-1);	
	}
		while(Sum(AL)<total){
		AL.add(coins.get(place));
		place++;
	}
	//System.out.println(AL);
	//System.out.println(Sum(AL));
	//if (place<AL.size()-1)
	//place++;
	}
	
	
	}
	public static int Sum(ArrayList<Integer> a){
		int sum = 0;
		for (int k = 0; k < a.size(); k++){
			sum+=a.get(k);
		}
		return sum;
	}
}
