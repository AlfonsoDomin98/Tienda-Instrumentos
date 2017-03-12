package Models;

public class Piano extends Instrumento{
	// ATRIBUTOS
	private int NumTeclas;
	
	// CONSTRUCTOR
	public Piano(String marca, String modelo, String color, double precio, boolean isAfinado) {
		super(marca, modelo, color, precio, isAfinado);
	}

	// METODOS
	public int getNumteclas(){
		return this.NumTeclas;
	}
	
	@Override
	public String toString(){
		return "El Piano es de la marca:" + this.getMarca() +" modelo: " + this.getModelo() + " color: "+ this.getColor() + " precio: "+this.getPrecio();
	}
}
