import java.util.Scanner;
public class ComisionV {
	public static void main (String [] args){
	Scanner sc=new Scanner(System.in);
	double Tcom=0, V, C ;
	System.out.println ("---------- comisiones del vendedor ----------");
	for (int i=1; i<=4; i++){
		System.out.print("ingrese el valor de la venta" + i + ": ");
		V=sc.nextDouble();
		if (V<=10000000){
			C=V*0.02;
		}
		else if (V>10000000 && V<15000000){
			C=V*0.04;
		}
		else if (V>=15000000){
			C=V*0.10;
		}
		else{
			C=0;
		}
		System.out.println("Comisión de la venta es: $" + i + C);
			Tcom = C;
		}
		System.out.println("\nEl total ganado por comisiones es: $" + Tcom);
		sc.close();
	
	}
}
