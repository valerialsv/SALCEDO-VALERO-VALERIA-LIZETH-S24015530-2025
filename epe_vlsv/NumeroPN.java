import java.util.Scanner;
public class NumeroPN{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Ingrese el numero");
	num=sc.nextInt();
	if (num/2==0){
		System.out.println("El numero es par");
	}
	else if (num/2!=0){
		System.out.println("El numero es impar");
	}
}
}