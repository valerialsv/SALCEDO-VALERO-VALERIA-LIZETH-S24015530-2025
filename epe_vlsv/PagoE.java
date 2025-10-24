import java.util.Scanner;
public class PagoE{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double sal, DS;
	System.out.print("\nEscriba el salario bruto del trabajador (de 1000 a 20000): ");
	sal=sc.nextDouble();
		if ((sal<=20000) && (sal>15000)){
			System.out.println(" \n------------------ categoria 1 ------------------\n");
			DS=(sal*0.072);
			System.out.println("El descuento por salud es de de: $" + DS);
			sal=sal-DS;
			System.out.println("El salario final del trabajador es de: $" + sal);
		} else
			if ((sal<=15000) && (sal>10000)){
				System.out.println(" \n------------------ categoria 2 ------------------\n");
				DS=(sal*0.072);
				System.out.println("El descuento por salud es de: $" + DS);
				sal=sal-DS;
				System.out.println("El salario final del trabajador es de: $" + sal);	
			} else 
				if ((sal<=10000) && (sal>7500)){
					System.out.println(" \n------------------ categoria 3 ------------------ \n");
					DS=(sal*0.072);
					System.out.println("El descuento por salud es de: $" + DS);
					sal=sal-DS;
					System.out.println("El salario final del trabajador es de: $" + sal);	
				} else 
					if ((sal<=7500) && (sal>1000)){
						System.out.println(" \n------------------ categoria 4 ------------------ \n");
						DS=(sal*0.072);
						System.out.println("El descuento por salud es de: $" + DS);
						sal=sal-DS;
						System.out.println("El salario final del trabajador es de: $" + sal);	
					}
					else
						if (sal<1000){
						sal=sal+(sal*0.15);	
						System.out.println("El salario final del trabajador con subsidio es de: $" + sal);
					}
	sc.close();
	}
}	