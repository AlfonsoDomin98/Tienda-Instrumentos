package Models;

public class Bateria extends Instrumento{
	// ATRIBUTOS
	private int NumTimbales;
	private int NumPlatos;

	// CONSTRUCTOR
	public Bateria(String marca, String modelo, String color, double precio, boolean isAfinado) {
		super(marca, modelo, color, precio, isAfinado);
	}
	
	// METODOS
	public void TocarInstrumento(){
		if(!this.isAfinado()){
			System.out.println("Tum pa Tum pa...");
		}
		else {
			System.out.println("[Mamporreos indescriptibles...");
		}
	}
	
	public int getNumTimbales(){
		return this.NumTimbales;
	}
	
	public int getNumPlatos(){
		return this.NumPlatos;
	}
	
	@Override
	public String toString(){
		return "La Bateria es de la marca:" + this.getMarca() +" modelo: " + this.getModelo() + " color: "+ this.getColor() + " precio: "+this.getPrecio();
	}
}
