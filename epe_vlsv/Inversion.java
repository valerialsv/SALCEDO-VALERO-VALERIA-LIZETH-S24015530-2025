import java.util.Scanner;
public class Inversion{
	public static void main (String [] args){
	double CI=0;
	Scanner sc= new Scanner (System.in);
	System.out.print ("\ningrese el monto de su capital inicial: ");
	CI=sc.nextDouble();
	sc.close();
	double G=CI*0.02;
	double CF=CI+G;
	System.out.print("\nsu ganancia fue de: " + G);
	System.out.println("\nsu capital final es de: " +CF);
	}
}