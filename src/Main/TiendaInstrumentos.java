package Main;

import java.util.Scanner;
import Models.*;

public class TiendaInstrumentos {
	
	private static Tienda tienda;

	public static void main(String[] args) {
		tienda = new Tienda();
	int opcion;
	do{
		opcion = MenuInicio();
		realizarOpcion(opcion);
		}
		while(opcion < 6);
		if (opcion == 6){
			System.out.println("/** Has salido del programa **/");
			System.out.println("/*** Hasta la proxima vez :) ***/");
		}
		}
	
	public static int MenuInicio(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Bienvenido a Musical ADN");
		System.out.println("Por favor, selecciona algunas de las siguientes opciones");
		System.out.println("1. Ver total de Ventas");
		System.out.println("2. Añadir Instrumentos al Stock");
		System.out.println("3. Probar Instrumento");
		System.out.println("4. Vender Instrumento");
		System.out.println("5. Listar todos los intrumentos");
		System.out.println("6. Salir de la tienda");
	
		return teclado.nextInt();
	}
	public static void realizarOpcion(int Opcion){
		switch(Opcion){
		case 1:
			tienda.TotalVentas();
			break;
		case 2:
			tienda.aniadirInstrumento();
			break;
		case 3:
			tienda.ProbarInstrumento();
			break;
		case 4:
			tienda.VenderInstrumento();
			break;
		case 5:
			tienda.ListadoInstrumentos();
			break;
		default:
			break;
		}
	}
}