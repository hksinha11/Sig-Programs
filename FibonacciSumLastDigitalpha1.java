import java.util.*;

public class FibonacciSumLastDigitalpha1 {
/*public static long piasoperiod(int m)
	{
		long a=0,b=1,c=a+b;
		int p=0;
		for(int i=0;i<m*m;i++)
		{
			c=(a+b)%10;
			a=b;
			b=c;
			if(a==0 && b==1) 
			{
				p=i+1;
				break;


			}

		}
		System.out.println(p);
		return p;


	}
*/	

   private static long getFibonacciSum(long from,long to) {
		
		long sum=0;	
		long remainder=to%60;
		long first=0;
		long second=1;
		long res=remainder;
		for(int i=1;i<remainder+2;i++)
		{
			res=(first+second);
			first=second;
			second=res;
		}
		sum=second;
		//System.out.println(sum);
		long remainder1=from%60;
		 long first1=0;
		 long second1=1;
		 long res1=remainder1;
		 long sum1=0;
		for(int i=1;i<remainder1+1;i++)
		{
			res1=(first1+second1);
			first1=second1;
			second1=res1;
		}
		sum1=second1;

		//System.out.println(sum1);
		if(sum1>sum)
			return (sum1-sum)%10;
		else
		return (sum-sum1)%10;	
		
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
	long to = scanner.nextLong();
        
        long s = getFibonacciSum(from,to);
        System.out.println(s);
    }
}

