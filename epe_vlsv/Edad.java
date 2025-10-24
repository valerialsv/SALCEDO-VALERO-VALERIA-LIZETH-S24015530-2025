import java.util.Scanner;
public class Edad {
	public static void main(String[]args) {
	int an=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println ("---------- Calcula tu edad ----------");
	System.out.print("\nIntroduce año de nacimiento: ");
	an= scanner.nextInt();
	scanner.close();
	int edad=2025-an;
	System.out.println("\nusted tiene: " + edad + " años");
	}
}