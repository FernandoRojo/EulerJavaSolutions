
public class doublePalindromes {
	public static void main(String[] args){
		long sum = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i +=2){
			if(isPalin(i+"")&&isPalin(Integer.toBinaryString(i))){
				sum+=i;
				System.out.println(i);
				
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPalin(String s){
		for (int i = 0; i < s.length()/2; i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}

}
