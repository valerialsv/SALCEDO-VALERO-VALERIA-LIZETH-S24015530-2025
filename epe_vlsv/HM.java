import java.util.Scanner;
public class HM {
	public static void main (String [] args){
	int H=0, M=0;
	double PM, PH, T;
	Scanner sc= new Scanner (System.in);
	System.out.print("---------- porcentaje de hombres y mujeres ----------");
	System.out.print("\nIngresa el numero de hombres: ");
	H=sc.nextInt();
	System.out.print("ingresa el numero de mujeres: ");
	M=sc.nextInt();
	sc.close();
	T=H+M;
	PM=(((double)M/T)*100);
	PH=(((double)H/T)*100);
	System.out.println("\nel porcentaje de mujeres es:" + PM + "%");
	System.out.println("el porcentaje de hombres es:" + PH + "%");
	}
}