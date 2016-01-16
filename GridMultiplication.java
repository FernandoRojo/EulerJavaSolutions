import java.io.*;
import java.util.*;


public class GridMultiplication {

	public static void main(String[] args) throws FileNotFoundException{
		File f = new File(args[0]);
		Scanner input = new Scanner(f);
		int[][] matrix = new int[20][20];
		int row = 0;
		int max = 0;
		int prod = 0;
		
		while (row<20)
		{
				String[] temp = input.nextLine().split(" ");
			    for (int k = 0; k<20; k++)
			    {
			    	matrix[row][k] = Integer.parseInt(temp[k]);
			    }
			    row++;
		}
		for (int k = 0; k < 20; k++)
		{
			for (int i = 0; i<20;i++)
			{
				if (k<17)
				{
					prod = matrix[k][i]*matrix[k+1][i]*matrix[k+2][i]*matrix[k+3][i];
			    if (prod>max)
			    {
			    	max = prod;
			    }
			    if (k>2&&i<17)
			    {
			    	prod = matrix[k][i]*matrix[k-1][i+1]*matrix[k-2][i+2]*matrix[k-3][i+3];
			    	if (prod>max)
				    {
				    	max = prod;
				    }
			    }
			    if (k<17&&i<17)
			    {
			    	prod = matrix[k][i]*matrix[k+1][i+1]*matrix[k+2][i+2]*matrix[k+3][i+3];
			    	if (prod>max)
				    {
				    	max = prod;
				    }
			    }
			    if (i<17)
			    {
			    	prod = matrix[k][i]*matrix[k][i+1]*matrix[k][i+2]*matrix[k][i+3];
			    	if (prod>max)
				    {
				    	max = prod;
				    }
			    }
			    
				}
					
			}
		}
		
		System.out.println(max);
            			    
			 
				
				
		  

	}

}
