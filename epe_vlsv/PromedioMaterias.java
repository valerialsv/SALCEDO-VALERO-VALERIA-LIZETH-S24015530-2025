import java.util.Scanner;
public class PromedioMaterias {
	public static void main(String[]args) {
	int c1,c2,c3;
	Scanner sc=new Scanner(System.in);
	System.out.print("\n----------- promedio -----------\n");
	System.out.println("ingrese la primera calificacion");
	c1=sc.nextInt();
	System.out.println("ingrese la segunda calificacion");
	c2=sc.nextInt();
	System.out.println("ingrese la tercera calificacion");
	c3=sc.nextInt();
	sc.close();
	double P=((c1+c2+c3)/3);
	System.out.println("\nsu promedio es de: " + P);
	System.out.print("--------------------------------");
	}
}