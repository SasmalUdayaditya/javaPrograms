package series;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1,i=0;
		int sum = 0;
		while(i<n)
		{
			System.out.println(sum);
			sum = a+b;
			a = b;
			b = sum;
			i+=1;
		}
		sc.close();
	}

}
