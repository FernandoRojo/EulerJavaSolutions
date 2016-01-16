import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Fractions implements Comparator{
	public static void main(String[] args) {
		ArrayList<F> fa = new ArrayList<F>();
		for(int k = 1;k<9;k++){
			for (int i = k+1; i<9;i++){
				F f = new F(k,i);
				f.reduce();
				fa.add(f);
				
			}
		}
	
	Collections.sort(fa);
	//System.out.println(fa);
	System.out.println(fa.get(fa.indexOf(new F(3,7))-1));
	}
	public int compare(Object o1, Object o2) {
		F f1 = (F) o1;
		F f2 = (F) o2;
		return f1.compareTo(f2);
	}
}

class F implements Comparable<F>{
	int num, den;
	double value;
	public F(int n, int d){
		num = n;
		den = d;
		value = (double) num/den;
	}
	public void reduce(){
		boolean reduced = true;
		while(reduced){
			reduced = false;
			for(int check = 2; check <=num;check++){
			if (num==1){
				break;
			}
			if (num%check==0&&den%check==0){
				num=num/check;
				den=den/check;
				check = 1;
				reduced = true;
			}
			}
		}
		
		value = (double) num/den;
	}
	public String toString(){
		return num+"/"+den+"="+value;
	}
	public double getValue(){
		return value;
	}
	public int compareTo(F arg0) {
		if (this.getValue()>arg0.getValue())
			return 1;
		if (this.getValue()==arg0.getValue())
			return 0;
		if (this.getValue()<arg0.getValue())
			return -1;
		
		return 0;
	}
	public boolean equals(Object o){
		F f1 = (F) o;
		if (this.getValue()==f1.getValue()){
			return true;
		}
		return false;
		
	}
}