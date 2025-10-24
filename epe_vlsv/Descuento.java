import java.util.Scanner;
public class Descuento{
	public static void main (String [] args){
	double Tcompra=0;
	Scanner sc=new Scanner (System.in);
	System.out.print("\n---------- descuento del 15% de tu compra ----------\n");
	System.out.print ("ingrese el total de su compra: ");
	Tcompra=sc.nextDouble();
	sc.close();
	double D=Tcompra*0.15;
	double PF=Tcompra-D;
	System.out.println("\nsu descuento fue de: " + D);
	System.out.print("su pago final es de: " + PF);
	}
}