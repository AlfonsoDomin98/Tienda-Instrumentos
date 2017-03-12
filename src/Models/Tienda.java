package Models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {
	// ATRIBUTOS
	private ArrayList <Instrumento> ListaInstrumentosStock;
	private ArrayList <Instrumento> TotalVentas;


	// CONSTRUCTOR
	
	public Tienda() {
		this.ListaInstrumentosStock = new ArrayList<Instrumento>();
		this.TotalVentas = new ArrayList<Instrumento>();
	}

	// METODOS
	public ArrayList <Instrumento> getListaInstrumentosStock(){
		return ListaInstrumentosStock;
	}
	
	public ArrayList <Instrumento> getTotalVentas(){
		return TotalVentas;
	}
	
	public void TotalVentas(){
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		for(Instrumento i : this.TotalVentas){
			System.out.println("El numero de ventas son: " );
			System.out.println(i);

		}
		if (this.TotalVentas.isEmpty()){
			System.out.println("No se ha realizado ninguna venta");
		}
		
		System.out.println("¿Desea volver al Menu de inicio?: S N");
		respuesta = teclado.nextLine();
		if(respuesta=="s"){
			MenuInicio();
		}
		if (respuesta=="n"){
			System.out.println("/** Has salido del programa **/");
			System.out.println("/*** Hasta la proxima vez :) ***/");
		}
	}
	
	public void ListadoInstrumentos(){
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.println("Hay disponibles los siguientes intrumentos: ");
		for (Instrumento i : this.getListaInstrumentosStock()){
			System.out.println(i);
			}
		if(this.ListaInstrumentosStock.isEmpty()){
			System.out.println("No hay ningun instrumento disponible");
		}
		System.out.println("¿Desea volver al Menu de inicio?: S N");
		respuesta = teclado.nextLine();
		if(respuesta=="s"){
			MenuInicio();
		}
		else {
			System.out.println("/** Has salido del programa **/");
			System.out.println("/*** Hasta la proxima vez :) ***/");
		}
	}
	
	
	
	public void aniadirInstrumento(){
		int opcion = MostrarMenuAñadir();
		String Marca, Modelo, Color, Respuesta, Tipo, Afinado;
		double Precio;
		boolean isAfinado = false;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Por favor, indique las siguientes caracteristicas del instrumento");
		if(opcion == 1){
			System.out.println("Tipo de Guitarra (Electrica, Acustica, Clasica):");
			Tipo = teclado.nextLine();
		}
		System.out.println("Marca del intrumento:");
		Marca = teclado.nextLine();
		System.out.println("Modelo del instrumento: ");
		Modelo = teclado.nextLine();
		System.out.println("Color del insturmento: ");
		Color = teclado.nextLine();
		System.out.println("Instrumento Afinado = S N");
		Afinado = teclado.nextLine();
		if(Afinado == "s"){
		 isAfinado = !isAfinado;
		}

		System.out.println("Precio del instrumento: ");
		Precio = teclado.nextDouble();
	
		
		System.out.println("Confirme si los siguientes datos sobre el instrumentos son correctos: ");
		System.out.println("Marca del instrumento: "+Marca);
		System.out.println("Modelo del instrumento: "+Modelo);
		System.out.println("Color del instrumento: "+Color);
		System.out.println("Precio del instrumento: "+Precio);
		System.out.println("Instrumento Afinado: "+isAfinado);
		System.out.println("Estan correcto los datos: S N");
		Respuesta = teclado.nextLine();
		
		if(Respuesta == "s"){
			System.out.println("Instrumento añadido correctamente!");
			
		}
		if(Respuesta=="n"){
			System.out.println("Por favor, introduzca de nuevo los datos");
			MostrarMenuAñadir();
			
		}
		
		switch(opcion){
		case 1: // Guitarra
			Instrumento guitar = new Guitarra(Marca, Modelo, Color, Precio, isAfinado);
			ListaInstrumentosStock.add(guitar);
			break;
		case 2: // Bateria 
			Instrumento Bateria = new Bateria(Marca, Modelo, Color, Precio, isAfinado);
			ListaInstrumentosStock.add(Bateria);
			break;
		case 3: // Piano
			Instrumento Piano = new Piano(Marca, Modelo, Color, Precio, isAfinado);
			ListaInstrumentosStock.add(Piano);
			break;
		case 4:
			MenuInicio();
			break;
		default:
			break;
		}
		
	}
	
	public void ProbarInstrumento(){
		Scanner teclado = new Scanner(System.in);
		int opcion = MostrarMenuPrueba();
		boolean isAfinado = false;
		String respuesta;
		if(this.ListaInstrumentosStock.isEmpty()){
			System.out.println("No hay ningun instrumento disponible para probar");
		}
		else{
		System.out.println("¿Se encuentra el instrumento afinado?: S N");
		respuesta = teclado.nextLine();
		if(respuesta == "s"){
			isAfinado = !isAfinado;
		}
		
		switch(opcion){
		case 1:	//GUITARRA
			if(!isAfinado){
				System.out.println("Tirorirori...");
			}
			else {
				System.out.println("[Maullidos indescriptibles...]");
			}
			break;
		case 2:	// BATERIA
			if(!isAfinado){
				System.out.println("Tum pa Tum pa...");
			}
			else{
				System.out.println("[Mamporreos indescriptibles...]");
			}
			break;
		case 3:	// PIANO
			if(!isAfinado){
				System.out.println("Ni no ni no ni no niii...");
			}
			else{
				System.out.println("[Chillidos indescriptibles...]");
			}
			break;
		case 4:
			MenuInicio();
		}
		System.out.println("¿Desea seguir en el programa?: S N");
		respuesta = teclado.nextLine();
		if(respuesta == "s"){
			MenuInicio();
		}
		if (respuesta =="n"){
				System.out.println("/** Has salido del programa **/");
				System.out.println("/*** Hasta la proxima vez :) ***/");
			
		}
		}
		
	}
	
	public void VenderInstrumento(){
		Scanner teclado = new Scanner(System.in);
		int opcion = MostrarMenuVender();
		String respuesta, Tipo, Marca, Modelo, Color;
		boolean isAfinado = false;
		double Precio;
		
		switch(opcion){
		case 1:
			System.out.println("Por favor, indique las siguientes caracteristicas del instrumento");
			System.out.println("Tipo de Guitarra (Electrica, Acustica, Clasica):");
			Tipo = teclado.nextLine();
			System.out.println("Marca de la Guitarra:");
			Marca = teclado.nextLine();
			System.out.println("Modelo de la Guitarra: ");
			Modelo = teclado.nextLine();
			System.out.println("Color de la Guitarra: ");
			Color = teclado.nextLine();
			System.out.println("Guitarra Afinada = S N");
			respuesta = teclado.nextLine();
			if(respuesta == "S"){
			 isAfinado = !isAfinado;
			}
			System.out.println("Precio de la Guitarra: ");
			Precio = teclado.nextDouble();
			teclado.nextLine();

			Instrumento guitar = new Guitarra(Marca, Modelo, Color, Precio, isAfinado);
			if(ListaInstrumentosStock.contains(guitar)){
				System.out.println("¿Quieres vender este producto?: S N");
				respuesta = teclado.nextLine();
				if(respuesta =="s"){
					System.out.println("Producto vendido!");
					TotalVentas.add(guitar);
				}
				else{
					MenuInicio();
				}
			}
			else{
				System.out.println("El producto no se encuentra en nuestros almacenes");
			}
			System.out.println("¿Desea volver al Menu de inicio?: S N");
			respuesta = teclado.nextLine();
			if(respuesta=="s"){
				MenuInicio();
			}
			else{
				System.out.println("/** Has salido del programa **/");
				System.out.println("/*** Hasta la proxima vez :) ***/");
			}
			
			break;
			
		case 2:
			System.out.println("Por favor, indique las siguientes caracteristicas del instrumento");
			System.out.println("Marca de la Bateria:");
			Marca = teclado.nextLine();
			System.out.println("Modelo de la Bateria: ");
			Modelo = teclado.nextLine();
			System.out.println("Color de la Bateria: ");
			Color = teclado.nextLine();
			System.out.println("Bateria Afinada = S N");
			respuesta = teclado.nextLine();
			if(respuesta == "S"){
			 isAfinado = !isAfinado;
			}
			System.out.println("Precio de la Bateria: ");
			Precio = teclado.nextDouble();
			teclado.nextLine();
			
			Instrumento bateria = new Bateria(Marca, Modelo, Color, Precio, isAfinado);
			
			if(ListaInstrumentosStock.contains(bateria)){
				System.out.println("¿Quieres vender este producto?: S N");
				respuesta = teclado.nextLine();
				if(respuesta =="s"){
					System.out.println("Producto vendido!");
					TotalVentas.add(bateria);
				}
				else{
					MenuInicio();
				}
			}
			else{
				System.out.println("El producto no se encuentra en nuestros almacenes");
			}
			System.out.println("¿Desea volver al Menu de inicio?: S N");
			respuesta = teclado.nextLine();
			if(respuesta=="s"){
				MenuInicio();
			}
			if(respuesta=="n"){
				System.out.println("/** Has salido del programa **/");
				System.out.println("/*** Hasta la proxima vez :) ***/");
			}
			break;
			
		case 3:
			System.out.println("Por favor, indique las siguientes caracteristicas del instrumento");
			System.out.println("Marca del Piano:");
			Marca = teclado.nextLine();
			System.out.println("Modelo del Piano: ");
			Modelo = teclado.nextLine();
			System.out.println("Color del Piano: ");
			Color = teclado.nextLine();
			System.out.println("Piano Afinada = S N");
			respuesta = teclado.nextLine();
			if(respuesta == "S"){
			 isAfinado = !isAfinado;
			}
			System.out.println("Precio del Piano: ");
			Precio = teclado.nextDouble();
			teclado.nextLine();
			
			Instrumento piano = new Piano(Marca, Modelo, Color, Precio, isAfinado);
			
			if(ListaInstrumentosStock.contains(piano)){
				System.out.println("¿Quieres vender este producto?: S N");
				respuesta = teclado.nextLine();
				if(respuesta =="s"){
					System.out.println("Producto vendido!");
					TotalVentas.add(piano);
				}
				else{
					MenuInicio();
				}
			}
			else{
				System.out.println("El producto no se encuentra en nuestros almacenes");
			}
			
			System.out.println("¿Desea volver al Menu de inicio?: S N");
			respuesta = teclado.nextLine();
			if(respuesta=="s"){
				MenuInicio();
			}
			else{
				System.out.println("/** Has salido del programa **/");
				System.out.println("/*** Hasta la proxima vez :) ***/");
			}
			break;
			
		case 4:
			MenuInicio();
			break;
		default:
			break;
			
		}
	}
	/**
	 * MENU PRINCIPAL
	 */
	public static int MenuInicio(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Por favor, selecciona algunas de las siguientes opciones");
		System.out.println("1. Ver total de Ventas");
		System.out.println("2. Añadir Instrumentos al Stock");
		System.out.println("3. Probar Instrumento");
		System.out.println("4. Vender Instrumento");
		System.out.println("5. Listar todos los intrumentos");
		System.out.println("6. Salir de la tienda");
	
		return teclado.nextInt();
	}
	
	/**
	 * MENU PARA MOSTRAR OPCIONES DE AÑADIR INSTRUMENTOS
	 * @return
	 */
	private static int MostrarMenuAñadir(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** SUBMENU - AÑADIR INTRUMENTO **/");
		System.out.println("Por favor, indique que tipo de instrumento desea añadir");
		System.out.println("1. Guitarra");
		System.out.println("2. Bateria");
		System.out.println("3. Piano");
		
		System.out.println("4. Volver al Menu Principal");
		
		return teclado.nextInt();
	}
	
	/**
	 * MENU PARA PROBAR INSTRUMENTOS
	 * 
	 */
	private static int MostrarMenuPrueba(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione el tipo de instrumento que desea probar");
		System.out.println("1. Guitarra");
		System.out.println("2. Bateria");
		System.out.println("3. Piano");
		
		System.out.println("4. Volver al Menu Principal");
		
		return teclado.nextInt();
	}
	
	private static int MostrarMenuVender(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, indique el instrumento que desea vender: ");
		System.out.println("1. Guitarra");
		System.out.println("2. Bateria");
		System.out.println("3. Piano");
		
		System.out.println("4. Volver al Menu Principal");
		
		
		return teclado.nextInt();
	}
	
	

	
}
