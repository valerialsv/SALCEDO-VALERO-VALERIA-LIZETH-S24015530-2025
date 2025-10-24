import java.util.Scanner;
public class ConversorMetros {
	public static void main (String [] args){
	double pm=3.28,metros=0;
	int PM=12;
	Scanner sc=new Scanner (System.in);	
	System.out.printl (\n---------- Conversor de metros a pies y pulgadas -----------\n");
	System.out.println ("introduce la cantidad en metros:");
	metros=scanner.nextDouble();
	scanner.close();
	double pies=metros*pm;
	double pulgadas=metros/0.0254;
	System.out.println("\n---------------- Resultado de la Conversión ---------------\n");
	System.out.println("la conversion de metros a pies es: " + pies);
	System.out.println("la conversion de metros a pulgadas es: " + pulgadas);
	System.out.println("\n-----------------------------------------------------------");
	}
}