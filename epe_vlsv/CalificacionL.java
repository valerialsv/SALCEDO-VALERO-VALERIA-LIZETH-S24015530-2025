import java.util.Scanner;
public class CalificacionL{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	double calificacion;
	System.out.println("Ingrese la calificación (0.0 - 5.0)");
	calificacion=sc.nextDouble();
	if ((calificacion==0.0) || (calificacion<=1.0)){
		System.out.println("Tu calificación es P (Pésimo)");
	}
	else if ((calificacion==1.1)||(calificacion<=2.0)){
		System.out.println("Tu califiación es M (Mala)");
	}
	else if ((calificacion==2.1)||(calificacion<=2.9)){
		System.out.println("Tu calificación es R (Regular)");
	}
	else if ((calificacion==3.0)||(calificacion<=4.0)){
		System.out.println("Tu calificación es B (Buena)");
	}
	else if ((calificacion==4.1)||(calificacion<=5.0)){
		System.out.println("Tu calificación es E (Excelente)");
	}
	else if (calificacion>=5.1){
		System.out.println("Esa calificación no existe");
	}
	}
}