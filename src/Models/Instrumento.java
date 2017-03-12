package Models;

public abstract class Instrumento implements Playable{
	// ATRIBUTOS
	private String Marca;
	private String Modelo;
	private String Color;
	private double Precio;
	private boolean isAfinado = false;
	private boolean Tocar;

	
	// CONSTRUCTOR
	public Instrumento(String marca, String modelo, String color, double precio, boolean isAfinado) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Precio = precio;
		this.isAfinado = isAfinado;
	}
	
	// METODO

	public void TocarInstrumentos(){
		System.out.println("Tocando Instrumentos!");
	}
	

	public void AfinarInstrumentos(){
		if(!isAfinado){
			System.out.println("Instrumeto afinado" + isAfinado); 
			isAfinado = !isAfinado;
		}
	}

	public String getMarca() {
		return Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public String getColor() {
		return Color;
	}

	public double getPrecio() {
		return Precio;
	}

	public boolean isAfinado() {
		return isAfinado;
	}

	public boolean isTocar() {
		return Tocar;
	}
	
	
}
