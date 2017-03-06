import java.util.*;

public class LCM {
	public static long gcd(long a,long b)
	{
		if(b==0) 
			return a;
	return gcd(b,a%b);
	}
  private static long lcm_naive(long a, long b) {
	  long lcm=  (a*b)/(gcd(a,b));
	  return lcm;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
