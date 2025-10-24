import java.util.Scanner;
public class DescuestoS {
	public static void main (String [] args){
	Scanner sc=new Scanner (System.in);
	double TC,D;
	int N;
	System.out.println ("---------- descuentos en el supermercado ----------");
	System.out.print ("\ningrese el total de la compra: ");
	TC= sc.nextDouble();
	System.out.print ("ingrese el numero escogido al azar por el cliente: ");
	N=sc.nextInt();
		if (N<74){
			D=TC*0.15;
		}
		else{
			D=TC*0.20;
		}
		double TP=TC+D;
		System.out.println ("\nel descuento aplicado es: $" + D);
		System.out.println ("el total a pagar es de: $" + TP);
		sc.close();
	}
}