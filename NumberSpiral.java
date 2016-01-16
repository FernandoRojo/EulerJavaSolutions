
public class NumberSpiral {

	public static void main(String[] args) {
		int counter = 2;
		int othercounter = 0;
		int value = 3;
		int sum = 4;
		while (counter < 4){		
			while (othercounter<counter){
			value++;
			othercounter++;
			}
		if (counter%2==0){
			sum+=value;
			}
		else{
			sum+=value-1;
			}
		othercounter = 0;
			while (othercounter<counter){
			value++;
			othercounter++;
			}
		sum+=value;
		System.out.println(sum);
		counter++;
		othercounter = 0;
		}
		sum += value+counter-1;
		System.out.println(sum);
	}

}
