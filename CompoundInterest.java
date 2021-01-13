package basicPrograms;

import java.util.Scanner;

public class CompoundInterest {
	
	int p, t, n;
	double r;
	
	CompoundInterest(int p, int t, double r, int n){
		this.p = p;
		this.t = t;
		this.r = r;
		this.n = n;
	}
	
	public void calculate(int p, int t, double r, int n) {
		double a = p * Math.pow(1 + ((r / 100) / n), n * t);
		double i = Math.round((a - p) * 100.0) / 100.0;
		System.out.println("Compound Interest: " + i);
	}
	
	public static void main(String[] args) {
		
		CompoundInterest obj = new CompoundInterest(0, 0, 0, 0);
		Scanner in = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		obj.p = in.nextInt();
		System.out.print("Enter amount of time in years: ");
		obj.t = in.nextInt();
		System.out.print("Enter annual interest rate in %: ");
		obj.r = in.nextInt();
		System.out.print("Enter number of times interest is compounded per unit of time: ");
		obj.n = in.nextInt();
		in.close();
		
		obj.calculate(obj.p, obj.t, obj.r, obj.n);
		
		
	}

}
