import java.util.Scanner;
import java.util.*;
public class FractionalKnapsack {
	

	private static double getOptimalValue(double capacity, double[] values, double[] weights) {
		double value = 0;
		int n=weights.length;
		double A[]=new double[n];

		double W=capacity;
		for(int k=0;k<n;k++)
		{
			A[k]=values[k]/weights[k];
		}
		double temp;
		double temp1;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (A[i] < A[j]) 
				{
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				temp1=weights[i];
				weights[i]=weights[j];
				weights[j]=temp1;
				}
			}
		}
/*	for(int k=0;k<n;k++)
		{
			System.out.println(A[k]);
			System.out.println(weights[k]);
		}
*/

		double a;
		for(int i=0;i<n;i++)
		{
			if(W==0)
				return value;
			if(weights[i]<W) 
				a=weights[i];
			else
				a=W;
			value=value+(a*A[i]);
		//	System.out.println(value);
			weights[i]=weights[i]-a;
			
			W=W-a;
		}
		return value;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double capacity = scanner.nextDouble();
		double[] values = new double[n];
		double[] weights = new double[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextDouble();
			weights[i] = scanner.nextDouble();
		}
		System.out.println(getOptimalValue(capacity, values, weights));
	}
} 
