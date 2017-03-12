package Models;

public class Guitarra extends Instrumento{
	// ATRIBUTOS
	private int NumCuerdas;
	private String [] Tipo = {"Electrica","Acustica","Clasica"};

	// CONSTRUCTOR
	public Guitarra(String marca, String modelo, String color, double precio, boolean isAfinado) {
		super(marca, modelo, color, precio, isAfinado);
	}
	
	// METODOS
	public void TocarInstrumentos(){
		if(!this.isAfinado()){
			System.out.println("Tiroriroriro...");
		}
		else {
			System.out.println("[Maullidos indescriptibles...]");
		}
	}
	public int NumeroCuerdas(){
		return this.NumCuerdas;
	}
	
	@Override
	public String toString(){
		return "La guitarra con marca:" + this.getMarca() +" modelo: " + this.getModelo() + " color: "+ getColor() + " precio: "+this.getPrecio();
	}

}
