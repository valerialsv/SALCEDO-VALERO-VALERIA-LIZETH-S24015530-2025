import java.util.Scanner;
public class LlamadaT {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int min;
	double t;
	System.out.println ("\n----------------- costo de llamada -----------------");
	System.out.print ("\ningrese la duracion de la llamada en minutos: ");
	min=sc.nextInt();
		if (min<=3) {
			t=10.00;
		}
		else{
			t=10.00 + (min-3)*1.00;
		}
		System.out.println ("el total a pagar por tu llamada es: $" + t);
		sc.close();
	}
}