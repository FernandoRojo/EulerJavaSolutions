import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


public class PokerHands {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("D:/2014-2015-Wash-U/Lab Lectures/p054_poker.txt"));
		while(in.hasNext()){
			String[] a = new String[5];
			for (int k = 0; k <5; k ++){
				a[k] = in.next();
			}
			Hand h = new Hand(a);
			//System.out.println(h);
			for (int k = 0; k <5; k ++){
				a[k] = in.next();
			}
			Hand h1 = new Hand(a);
			//System.out.println(h1);
			
		}
	}

}
class Hand{
	int high;
	String[] cards;
	String[] cv = {"A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	char pairValue;
	boolean twopair, pair,flushb, Str;
	public Hand(String[] a){
		cards = Arrays.copyOf(a, 5);
		Arrays.sort(cards);
		this.Pair();
		this.flush();
		this.Straight();
	}
	public void Pair(){
		int counter = 0;
		for (int k = 0; k < 5; k++){
			for (int i = k+1; i<5; i++){
				if (cards[k].charAt(0)==cards[i].charAt(0)){
					pairValue = cards[k].charAt(0);
					counter++;
				}
			}
		}
		if (counter == 2)
			twopair=true;
		if (counter==1)
			pair = true;
		
	}
	public void flush(){
		char c = cards[0].charAt(1);
		int counter=0;
		for (int i = 1; i<5; i++){
			if (cards[i].charAt(1)==c){
				counter++;
			}
		}
		if (counter >= 4){
		flushb=true;
		}	
	}
	public void Straight(){
		char c = cards[0].charAt(0);
		List<String> cv1 = Arrays.asList(cv);
		ArrayList<String> st = new ArrayList<String>();
		for (String s:cards){
			st.add(s.substring(0, 1));
		}
		//System.out.println(st);
		int card = cv1.indexOf(c+"");
		if (card>=9)
			return;
		if (st.contains(cv1.get(card+1))&&st.contains(cv1.get(card+2))&&st.contains(cv1.get(card+3))&&st.contains(cv1.get(card+4))){
		Str=true;
		System.out.println(this);
		}
	}
	
	public String toString(){
		return Arrays.toString(cards) + Str;
	}
}
