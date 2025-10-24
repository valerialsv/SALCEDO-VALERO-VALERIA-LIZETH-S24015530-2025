import java.util.Scanner;
public class NumeroPrim{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Ingrese el numero");
	num=sc.nextInt();
	if ((num%num==0)||(num%1==0)){
		System.out.println("El numero es primo");
	}
	else if ((num%num!=0)||(num%1!=0)){
		System.out.println("El numero no es primo");
	}
}
}