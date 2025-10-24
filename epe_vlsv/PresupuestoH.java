import java.util.Scanner;
public class PresupuestoH {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double pre,g,t,p;
	System.out.println ("\n-------------- presupuesto hospitalario --------------");
	System.out.print ("\ningrese el monto total del presupuesto anual: ");
	pre=sc.nextDouble();
	g= pre*0.40;
	t=pre*0.30;
	p=pre*0.30;
	System.out.println("\n------------ distribución del presupuesto ------------");
        System.out.println("Ginecología: $" + g);
        System.out.println("Traumatología: $" + t);
        System.out.println("Pediatría: $" + p);
        sc.close();
    }
}
