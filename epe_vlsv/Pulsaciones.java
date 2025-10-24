import java.util.Scanner;
public class Pulsaciones {
	public static void main(String[] args) {
	int edad=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("\n------------------------ pulsaciones recomendadas ------------------------\n");
	System.out.print("Introduce tu edad: ");
	edad = scanner.nextInt();
	scanner.close();
	double puls=(220-edad)/10;
	System.out.println("las pulsaciones respecto a su edad por 10 seg de actividad fisica son: " + puls);
	System.out.println("\n---------------------------------------------------------------------------");
	}
}