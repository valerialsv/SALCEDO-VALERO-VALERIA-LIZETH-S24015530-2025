import java.util.Scanner;
public class LongitudArea {
	public static void main(String[] args) {
	double pi=3.1416, radio=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("\n---------- Longitud y àrea de una circunferencia ----------\n");
	System.out.print("Introduce el radio: ");
	radio = scanner.nextDouble();
	scanner.close();
	double l= 2*pi*radio;
	double a= (pi*(radio*radio));
	System.out.println("\nla longitud es: " + l);
	System.out.println("el area es: " + a);
	System.out.println("\n-----------------------------------------------------------");
	}
}