package series;

import java.util.*;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm = Math.max(a, b);
		boolean i = true;
		while(i)
		{
			if(lcm % a==0 && lcm % b==0)
			{
				System.out.println(lcm);
				i=false;
				break;
			}
			lcm+=1;
		}
		sc.close();
	}
}
