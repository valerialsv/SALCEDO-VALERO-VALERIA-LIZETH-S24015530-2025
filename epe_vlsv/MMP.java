import java.util.Scanner;
public class MMP{
	public static void main (String [] args){
	Scanner sc=new Scanner (System.in);
	System.out.println("---------- Mayor, menor y promedio ----------");
	System.out.print ("ingrese le primer valor (A): ");
	double A=sc.nextDouble();
	System.out.print ("ingrese el segundo valor (B): ");
	double B=sc.nextDouble();
	System.out.print ("ingrese el tercer numero (C): ");
	double C=sc.nextDouble();
	if (A==B && B==C){
		System.out.println ("los valores son iguales: " + A);
		System.out.println ("el promedio es: " +A);
	}
	else{
		double mayor=A;
		double menor=A;
		if (B>mayor){
			mayor=B;
		}
		if (C>mayor){
			mayor=C;
		}
		if (B<menor){
			menor=B;
		}
		if (C<menor){
			menor=C;
		}
		double P=((A+B+C)/3);
		System.out.println ("\nel valor mayor es: " + mayor);
		System.out.println ("el valor menor es: " + menor);
		System.out.printf("el promedio es: " + P);
		}
		sc.close();
	}
}

