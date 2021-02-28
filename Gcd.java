package series;

import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = Math.min(a, b);
		boolean i = true;
		while(i)
		{
			if(a % gcd==0 && b % gcd==0)
			{
				System.out.println(gcd);
				i=false;
				break;
			}
			gcd -=1;
		}
		sc.close();
	}
}
