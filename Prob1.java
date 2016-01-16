/**
 * 
 */

/**
 * @author Fernando
 *
 */
public class Prob1 {

	public static void main(String[] args) {
		double prob = 0.001;
		double prob4 = 1;
		double prob6 = 1;
		for (prob = .001; prob<1.000; prob+=.001){
			prob4 = (6*Math.pow(prob,2)*Math.pow((1-prob),2))+4*(Math.pow(prob, 3)*(1-prob))+Math.pow(prob,4);
			prob6 = (20*Math.pow(prob,3)*Math.pow((1-prob),3))+(15*Math.pow(prob,4)*Math.pow((1-prob),2))+(6*Math.pow(prob,5)*Math.pow((1-prob),1))+Math.pow(prob,6);
			System.out.println(prob + "; " + prob4 + ", " + prob6);
			if (prob6>prob4){
				System.out.println(prob);
				break;
			}
		}

	}

}
