import java.util.Scanner;
public class Raices{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("ingrese el valor de A:");
	double A=sc.nextDouble();
	System.out.print("ingrese el valor de B:");
	double B=sc.nextDouble();
	System.out.print("ingrese el valor de C:");
	double C=sc.nextDouble();
	if (A==0)
		System.out.println("A=0 no es una ecuacion cuadratica");
	double d=B*B-4*A*C;
	if (d<0){
		double real=-B/(2*A);
		double imaginaria= Math.sqrt(-d)/(2*A);
		System.out.println("Raices complejas:");
		System.out.println("x1=" + real + " +" + imaginaria + "i");
		System.out.println("x2=" +real+ "-" + imaginaria + "i");
	}
	else if (d==0){
		double x =-B/(2*A);
		System.out.println ("una raiz doble real: x=" + x);
	}
	else {
		double x1= (-B+ Math.sqrt(d))/(2*A);
		double x2= (-B- Math.sqrt(d))/(2*A);
		System.out.println("raiz 1: " +x1);
		System.out.println("raiz 2: " + x2);
	}
	sc.close();
	}
}

		