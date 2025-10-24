import java.util.Scanner;
public class Temperatura{
	public static void main(String[]args) {
	int C=0;
	Scanner sc=new Scanner (System.in);
	System.out.print("---------- conversion de temperatura ----------");
	System.out.println ("\nintroduce la temperatura en celsius (ºC):");
	C= sc.nextInt();
	sc.close();
	double F=((C*9/5)+32);
	double K=C+273.15;
	System.out.print("la temperatura en Fahrenheit es:" + F);
	System.out.print("\nla temperatura en kelvin es:" + K);
	}
}