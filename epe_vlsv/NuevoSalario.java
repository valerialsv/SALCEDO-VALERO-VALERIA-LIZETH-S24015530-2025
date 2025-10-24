import java.util.Scanner;
public class NuevoSalario{
	public static void main (String [] args){
	double SI=0;
	Scanner sc=new Scanner (System.in);
	System.out.print("\ningrese el salario del trabajador: ");
	SI=sc.nextDouble();
	sc.close();
	double I=SI*0.25;
	double NS=SI+I;
	System.out.print("\nel incremento del salario es de: " + I);
	System.out.print("\nel nuevo salario del trabajador es de: " + NS);
	}
}